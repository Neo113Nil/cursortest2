package io.intercom.android.sdk.m5.conversation.data;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import io.ably.lib.realtime.Presence;
import io.intercom.android.nexus.EventData;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.models.Avatar;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: NexusEventAsFlow.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0006H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¨\u0006\r"}, d2 = {"nexusEventAsFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "nexusClient", "Lio/intercom/android/nexus/NexusClient;", "asNexusData", "Lio/intercom/android/nexus/NexusEvent;", "safeGetOrDefault", "", "Lio/intercom/android/nexus/EventData;", SDKConstants.PARAM_KEY, "", "default", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NexusEventAsFlowKt {

    /* compiled from: NexusEventAsFlow.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NexusEventType.values().length];
            try {
                iArr[NexusEventType.AdminIsTyping.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NexusEventType.UserContentSeenByAdmin.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NexusEventType.NewComment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NexusEventType.ConversationPartToken.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Flow<ParsedNexusEvent> nexusEventAsFlow(NexusClient nexusClient) {
        Intrinsics.checkNotNullParameter(nexusClient, "nexusClient");
        return FlowKt.callbackFlow(new NexusEventAsFlowKt$nexusEventAsFlow$1(nexusClient, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParsedNexusEvent asNexusData(NexusEvent nexusEvent) {
        ArrayList build;
        NexusEventType eventType = nexusEvent.getEventType();
        int i = eventType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i == 1) {
            String optString = nexusEvent.getEventData().optString("conversationId");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            String optString2 = nexusEvent.getEventData().optString("createdByUserId");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            Avatar.Builder withImageUrl = new Avatar.Builder().withImageUrl(nexusEvent.getEventData().optString("adminAvatar"));
            AvatarShape.Companion companion = AvatarShape.INSTANCE;
            String optString3 = nexusEvent.getEventData().optString("avatarShape");
            Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
            Avatar build2 = withImageUrl.withShape(companion.fromName(optString3)).build();
            Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
            EventData eventData = nexusEvent.getEventData();
            Intrinsics.checkNotNullExpressionValue(eventData, "getEventData(...)");
            Object safeGetOrDefault = safeGetOrDefault(eventData, "isBot", false);
            Intrinsics.checkNotNull(safeGetOrDefault, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) safeGetOrDefault).booleanValue();
            EventData eventData2 = nexusEvent.getEventData();
            Intrinsics.checkNotNullExpressionValue(eventData2, "getEventData(...)");
            Object safeGetOrDefault2 = safeGetOrDefault(eventData2, "showAvatar", true);
            Intrinsics.checkNotNull(safeGetOrDefault2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue2 = ((Boolean) safeGetOrDefault2).booleanValue();
            String optString4 = nexusEvent.getEventData().optString(Presence.GET_CLIENTID);
            Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
            return new ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping(optString, optString2, build2, booleanValue, booleanValue2, optString4);
        }
        if (i == 2) {
            String optString5 = nexusEvent.getEventData().optString("conversationId");
            Intrinsics.checkNotNullExpressionValue(optString5, "optString(...)");
            String optString6 = nexusEvent.getEventData().optString("createdByUserId");
            Intrinsics.checkNotNullExpressionValue(optString6, "optString(...)");
            Avatar build3 = new Avatar.Builder().withImageUrl(nexusEvent.getEventData().optString("adminAvatar")).build();
            Intrinsics.checkNotNullExpressionValue(build3, "build(...)");
            EventData eventData3 = nexusEvent.getEventData();
            Intrinsics.checkNotNullExpressionValue(eventData3, "getEventData(...)");
            Object safeGetOrDefault3 = safeGetOrDefault(eventData3, "isBot", false);
            Intrinsics.checkNotNull(safeGetOrDefault3, "null cannot be cast to non-null type kotlin.Boolean");
            return new ParsedNexusEvent.ConversationNexusEvent.UserContentSeenByAdmin(optString5, optString6, build3, ((Boolean) safeGetOrDefault3).booleanValue());
        }
        if (i == 3) {
            String optString7 = nexusEvent.getEventData().optString("conversationId");
            Intrinsics.checkNotNullExpressionValue(optString7, "optString(...)");
            String optString8 = nexusEvent.getEventData().optString("createdByUserId");
            Intrinsics.checkNotNullExpressionValue(optString8, "optString(...)");
            return new ParsedNexusEvent.ConversationNexusEvent.NewComment(optString7, optString8, nexusEvent.getEventData().optString("ticketId"), null, 8, null);
        }
        if (i == 4) {
            Object obj = nexusEvent.getEventData().get("blocks");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray = (JSONArray) obj;
            try {
                String jSONArray2 = jSONArray.toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
                Type type = new TypeToken<ArrayList<Block.Builder>>() { // from class: io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$asNexusData$blocks$type$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                ArrayList arrayList = (ArrayList) new Gson().fromJson(jSONArray2, type);
                Intrinsics.checkNotNull(arrayList);
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((Block.Builder) it.next()).build());
                }
                build = arrayList3;
            } catch (JsonSyntaxException unused) {
                List createListBuilder = CollectionsKt.createListBuilder();
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj2 = jSONArray.get(i2);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj2;
                    Block build4 = new Block.Builder().withType(jSONObject.optString("type")).withText(jSONObject.optString("text")).build();
                    Intrinsics.checkNotNullExpressionValue(build4, "build(...)");
                    createListBuilder.add(build4);
                }
                build = CollectionsKt.build(createListBuilder);
            }
            String optString9 = nexusEvent.getEventData().optString("conversationId");
            Intrinsics.checkNotNullExpressionValue(optString9, "optString(...)");
            String optString10 = nexusEvent.getEventData().optString("clientAssignedUuid");
            Intrinsics.checkNotNullExpressionValue(optString10, "optString(...)");
            String optString11 = nexusEvent.getEventData().optString("partType");
            Intrinsics.checkNotNullExpressionValue(optString11, "optString(...)");
            Object obj3 = nexusEvent.getEventData().get("tokenSequenceIndex");
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            return new ParsedNexusEvent.ConversationNexusEvent.FinStreaming(optString9, optString10, optString11, ((Integer) obj3).intValue(), build);
        }
        return ParsedNexusEvent.UnSupportedEvent.INSTANCE;
    }

    private static final Object safeGetOrDefault(EventData eventData, String str, Object obj) {
        Object orDefault = eventData.getOrDefault(str, obj);
        Intrinsics.checkNotNull(orDefault);
        return orDefault;
    }
}
