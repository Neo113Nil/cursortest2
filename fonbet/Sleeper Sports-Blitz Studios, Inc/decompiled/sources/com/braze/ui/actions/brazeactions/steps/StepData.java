package com.braze.ui.actions.brazeactions.steps;

import com.appsflyer.AppsFlyerProperties;
import com.braze.enums.Channel;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: StepData.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u0000 .2\u00020\u0001:\u0001.B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001a\u001a\u00020\u001bJ\u001c\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u001b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#J\u000e\u0010$\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010%\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010&\u001a\u00020'H\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u001d\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0017\u0010\u0014¨\u0006/"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/StepData;", "", "srcJson", "Lorg/json/JSONObject;", AppsFlyerProperties.CHANNEL, "Lcom/braze/enums/Channel;", "<init>", "(Lorg/json/JSONObject;Lcom/braze/enums/Channel;)V", "getSrcJson", "()Lorg/json/JSONObject;", "getChannel", "()Lcom/braze/enums/Channel;", StepData.ARGS, "", "getArgs", "()Ljava/util/List;", "args$delegate", "Lkotlin/Lazy;", "firstArg", "getFirstArg", "()Ljava/lang/Object;", "firstArg$delegate", "secondArg", "getSecondArg", "secondArg$delegate", "getArg", "index", "", "getArg$android_sdk_ui_release", "coerceArgToPropertiesOrNull", "Lcom/braze/models/outgoing/BrazeProperties;", "isArgCountInBounds", "", "fixedArgCount", "rangedArgCount", "Lkotlin/ranges/IntRange;", "isArgString", "isArgOptionalJsonObject", InAppPurchaseConstants.METHOD_TO_STRING, "", "component1", "component2", "copy", "equals", "other", "hashCode", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StepData {
    public static final String ARGS = "args";

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args;
    private final Channel channel;

    /* renamed from: firstArg$delegate, reason: from kotlin metadata */
    private final Lazy firstArg;

    /* renamed from: secondArg$delegate, reason: from kotlin metadata */
    private final Lazy secondArg;
    private final JSONObject srcJson;

    public static /* synthetic */ StepData copy$default(StepData stepData, JSONObject jSONObject, Channel channel, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = stepData.srcJson;
        }
        if ((i & 2) != 0) {
            channel = stepData.channel;
        }
        return stepData.copy(jSONObject, channel);
    }

    /* renamed from: component1, reason: from getter */
    public final JSONObject getSrcJson() {
        return this.srcJson;
    }

    /* renamed from: component2, reason: from getter */
    public final Channel getChannel() {
        return this.channel;
    }

    public final StepData copy(JSONObject srcJson, Channel channel) {
        Intrinsics.checkNotNullParameter(srcJson, "srcJson");
        Intrinsics.checkNotNullParameter(channel, "channel");
        return new StepData(srcJson, channel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepData)) {
            return false;
        }
        StepData stepData = (StepData) other;
        return Intrinsics.areEqual(this.srcJson, stepData.srcJson) && this.channel == stepData.channel;
    }

    public int hashCode() {
        return (this.srcJson.hashCode() * 31) + this.channel.hashCode();
    }

    public StepData(JSONObject srcJson, Channel channel) {
        Intrinsics.checkNotNullParameter(srcJson, "srcJson");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.srcJson = srcJson;
        this.channel = channel;
        this.args = LazyKt.lazy(new Function0() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List args_delegate$lambda$0;
                args_delegate$lambda$0 = StepData.args_delegate$lambda$0(StepData.this);
                return args_delegate$lambda$0;
            }
        });
        this.firstArg = LazyKt.lazy(new Function0() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object firstArg_delegate$lambda$1;
                firstArg_delegate$lambda$1 = StepData.firstArg_delegate$lambda$1(StepData.this);
                return firstArg_delegate$lambda$1;
            }
        });
        this.secondArg = LazyKt.lazy(new Function0() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object secondArg_delegate$lambda$2;
                secondArg_delegate$lambda$2 = StepData.secondArg_delegate$lambda$2(StepData.this);
                return secondArg_delegate$lambda$2;
            }
        });
    }

    public final JSONObject getSrcJson() {
        return this.srcJson;
    }

    public /* synthetic */ StepData(JSONObject jSONObject, Channel channel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i & 2) != 0 ? Channel.UNKNOWN : channel);
    }

    public final Channel getChannel() {
        return this.channel;
    }

    private final List<Object> getArgs() {
        return (List) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List args_delegate$lambda$0(StepData stepData) {
        Iterator it;
        final JSONArray optJSONArray = stepData.srcJson.optJSONArray(ARGS);
        if (optJSONArray == null) {
            it = CollectionsKt.emptyList().iterator();
        } else {
            it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, optJSONArray.length())), new Function1<Integer, Boolean>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args_delegate$lambda$0$$inlined$iterator$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Boolean invoke(int i) {
                    return Boolean.valueOf(optJSONArray.opt(i) instanceof Object);
                }
            }), new Function1<Integer, Object>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args_delegate$lambda$0$$inlined$iterator$2
                public final Object invoke(int i) {
                    Object obj = optJSONArray.get(i);
                    if (obj != null) {
                        return obj;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }
            }).iterator();
        }
        return SequencesKt.toList(SequencesKt.asSequence(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object firstArg_delegate$lambda$1(StepData stepData) {
        return stepData.getArg$android_sdk_ui_release(0);
    }

    public final Object getFirstArg() {
        return this.firstArg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object secondArg_delegate$lambda$2(StepData stepData) {
        return stepData.getArg$android_sdk_ui_release(1);
    }

    public final Object getSecondArg() {
        return this.secondArg.getValue();
    }

    public final Object getArg$android_sdk_ui_release(int index) {
        return CollectionsKt.getOrNull(getArgs(), index);
    }

    public final BrazeProperties coerceArgToPropertiesOrNull(int index) {
        Object orNull = CollectionsKt.getOrNull(getArgs(), index);
        if (orNull == null || !(orNull instanceof JSONObject)) {
            return null;
        }
        return new BrazeProperties((JSONObject) orNull);
    }

    public static /* synthetic */ boolean isArgCountInBounds$default(StepData stepData, int i, IntRange intRange, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            intRange = null;
        }
        return stepData.isArgCountInBounds(i, intRange);
    }

    public final boolean isArgCountInBounds(final int fixedArgCount, final IntRange rangedArgCount) {
        if (fixedArgCount != -1 && getArgs().size() != fixedArgCount) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isArgCountInBounds$lambda$3;
                    isArgCountInBounds$lambda$3 = StepData.isArgCountInBounds$lambda$3(fixedArgCount, this);
                    return isArgCountInBounds$lambda$3;
                }
            }, 7, (Object) null);
            return false;
        }
        if (rangedArgCount == null || rangedArgCount.contains(getArgs().size())) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isArgCountInBounds$lambda$4;
                isArgCountInBounds$lambda$4 = StepData.isArgCountInBounds$lambda$4(IntRange.this, this);
                return isArgCountInBounds$lambda$4;
            }
        }, 7, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgCountInBounds$lambda$3(int i, StepData stepData) {
        return "Expected " + i + " arguments. Got: " + stepData.getArgs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgCountInBounds$lambda$4(IntRange intRange, StepData stepData) {
        return "Expected " + intRange + " arguments. Got: " + stepData.getArgs();
    }

    public final boolean isArgString(final int index) {
        if (getArg$android_sdk_ui_release(index) instanceof String) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isArgString$lambda$5;
                isArgString$lambda$5 = StepData.isArgString$lambda$5(index, this);
                return isArgString$lambda$5;
            }
        }, 7, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgString$lambda$5(int i, StepData stepData) {
        return "Argument [" + i + "] is not a String. Source: " + stepData.srcJson;
    }

    public final boolean isArgOptionalJsonObject(final int index) {
        Object arg$android_sdk_ui_release = getArg$android_sdk_ui_release(index);
        if (arg$android_sdk_ui_release == null || (arg$android_sdk_ui_release instanceof JSONObject)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isArgOptionalJsonObject$lambda$6;
                isArgOptionalJsonObject$lambda$6 = StepData.isArgOptionalJsonObject$lambda$6(index, this);
                return isArgOptionalJsonObject$lambda$6;
            }
        }, 7, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgOptionalJsonObject$lambda$6(int i, StepData stepData) {
        return "Argument [" + i + "] is not a JSONObject. Source: " + stepData.srcJson;
    }

    public String toString() {
        return "Channel " + this.channel + " and json\n" + JsonUtils.getPrettyPrintedString(this.srcJson);
    }
}
