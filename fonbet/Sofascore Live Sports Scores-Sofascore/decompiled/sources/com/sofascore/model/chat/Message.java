package com.sofascore.model.chat;

import androidx.core.app.NotificationCompat;
import com.ironsource.L6;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.b1c;
import defpackage.gz1;
import defpackage.joa;
import defpackage.lm5;
import defpackage.oea;
import defpackage.q5h;
import defpackage.q79;
import defpackage.qq3;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010$\n\u0002\b\u0006\b\u0007\u0018\u0000 |2\u00020\u0001:\u0002|}B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0085\u0002\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b\r\u0010(J\u0015\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u00103J'\u0010;\u001a\u00020,2\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u0010DR(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010E\u0012\u0004\bI\u0010.\u001a\u0004\bF\u00103\"\u0004\bG\u0010HR(\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010E\u0012\u0004\bL\u0010.\u001a\u0004\bJ\u00103\"\u0004\bK\u0010HR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010M\u001a\u0004\b\f\u0010NR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bO\u00103R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010E\u001a\u0004\bU\u00103\"\u0004\bV\u0010HR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0014\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010Z\u001a\u0004\b[\u0010\\R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b]\u0010>R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010^\u001a\u0004\b_\u0010`R\"\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010M\u001a\u0004\b\u0019\u0010N\"\u0004\ba\u0010bR\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010M\u001a\u0004\b\u001a\u0010N\"\u0004\bc\u0010bR\"\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010M\u001a\u0004\b\u001b\u0010N\"\u0004\bd\u0010bR(\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010<\u0012\u0004\bh\u0010.\u001a\u0004\be\u0010>\"\u0004\bf\u0010gR \u0010\u001d\u001a\u00020\u000b8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u001d\u0010M\u0012\u0004\bi\u0010.\u001a\u0004\b\u001d\u0010NR \u0010\u001e\u001a\u00020\u000b8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u001e\u0010M\u0012\u0004\bj\u0010.\u001a\u0004\b\u001e\u0010NR(\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010M\u0012\u0004\bl\u0010.\u001a\u0004\b\u001f\u0010N\"\u0004\bk\u0010bR \u0010 \u001a\u00020\u000b8\u0006X\u0087D¢\u0006\u0012\n\u0004\b \u0010M\u0012\u0004\bm\u0010.\u001a\u0004\b \u0010NR(\u0010!\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b!\u0010M\u0012\u0004\bo\u0010.\u001a\u0004\b!\u0010N\"\u0004\bn\u0010bR*\u0010p\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bp\u0010q\u0012\u0004\bv\u0010.\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010<R\u0018\u0010#\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010<R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010wR\u001d\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020x8F¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006~"}, d2 = {"Lcom/sofascore/model/chat/Message;", "", "", "text", "Lcom/sofascore/model/chat/ChatUser;", "user", "", "timestamp", "", "voteCount", "reportCount", "", "isAirCashMessage", "<init>", "(Ljava/lang/String;Lcom/sofascore/model/chat/ChatUser;JIIZ)V", "seen0", "id", "Lcom/sofascore/model/chat/ChatImage;", "image", "unReportCount", "parent", "deletedParentMessage", "countryFlag", "Lcom/sofascore/model/chat/Type;", "type", "isServer", "isLinkify", "isAd", "srcLang", "isSanctioned", "isSystem", "isVoted", "isDeleted", "isReported", "hiddenFor", "visibleFor", "", "trans", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/sofascore/model/chat/ChatUser;JIIZILcom/sofascore/model/chat/ChatImage;ILcom/sofascore/model/chat/Message;Ljava/lang/Boolean;Ljava/lang/String;Lcom/sofascore/model/chat/Type;ZZZLjava/lang/String;ZZZZZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lt5h;)V", "userId", "isMessageValid", "(Ljava/lang/String;)Z", "", "setLocal", "()V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$model_release", "(Lcom/sofascore/model/chat/Message;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/sofascore/model/chat/ChatUser;", "getUser", "()Lcom/sofascore/model/chat/ChatUser;", "J", "getTimestamp", "()J", "I", "getVoteCount", "setVoteCount", "(I)V", "getVoteCount$annotations", "getReportCount", "setReportCount", "getReportCount$annotations", "Z", "()Z", "getId", "Lcom/sofascore/model/chat/ChatImage;", "getImage", "()Lcom/sofascore/model/chat/ChatImage;", "setImage", "(Lcom/sofascore/model/chat/ChatImage;)V", "getUnReportCount", "setUnReportCount", "Lcom/sofascore/model/chat/Message;", "getParent", "()Lcom/sofascore/model/chat/Message;", "Ljava/lang/Boolean;", "getDeletedParentMessage", "()Ljava/lang/Boolean;", "getCountryFlag", "Lcom/sofascore/model/chat/Type;", "getType", "()Lcom/sofascore/model/chat/Type;", "setServer", "(Z)V", "setLinkify", "setAd", "getSrcLang", "setSrcLang", "(Ljava/lang/String;)V", "getSrcLang$annotations", "isSanctioned$annotations", "isSystem$annotations", "setVoted", "isVoted$annotations", "isDeleted$annotations", "setReported", "isReported$annotations", "avatarOverrideRes", "Ljava/lang/Integer;", "getAvatarOverrideRes", "()Ljava/lang/Integer;", "setAvatarOverrideRes", "(Ljava/lang/Integer;)V", "getAvatarOverrideRes$annotations", "Ljava/util/Map;", "", "getTranslations", "()Ljava/util/Map;", "translations", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Message {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Integer avatarOverrideRes;

    @Nullable
    private final String countryFlag;

    @Nullable
    private final Boolean deletedParentMessage;

    @Nullable
    private String hiddenFor;
    private final int id;

    @Nullable
    private ChatImage image;
    private boolean isAd;
    private final boolean isAirCashMessage;
    private final boolean isDeleted;
    private boolean isLinkify;
    private boolean isReported;
    private final boolean isSanctioned;
    private boolean isServer;
    private final boolean isSystem;
    private boolean isVoted;

    @Nullable
    private final Message parent;
    private int reportCount;

    @NotNull
    private String srcLang;

    @NotNull
    private final String text;
    private final long timestamp;

    @Nullable
    private Map<String, String> trans;

    @NotNull
    private final Type type;
    private int unReportCount;

    @Nullable
    private final ChatUser user;

    @Nullable
    private String visibleFor;
    private int voteCount;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new b1c(11)), null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysaVar, new b1c(12))};
    }

    public /* synthetic */ Message(int i, String str, ChatUser chatUser, long j, int i2, int i3, boolean z, int i4, ChatImage chatImage, int i5, Message message, Boolean bool, String str2, Type type, boolean z2, boolean z3, boolean z4, String str3, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str4, String str5, Map map, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, Message$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = str;
        this.user = chatUser;
        this.timestamp = j;
        if ((i & 8) == 0) {
            this.voteCount = 0;
        } else {
            this.voteCount = i2;
        }
        if ((i & 16) == 0) {
            this.reportCount = 0;
        } else {
            this.reportCount = i3;
        }
        if ((i & 32) == 0) {
            this.isAirCashMessage = false;
        } else {
            this.isAirCashMessage = z;
        }
        if ((i & 64) == 0) {
            this.id = 0;
        } else {
            this.id = i4;
        }
        if ((i & 128) == 0) {
            this.image = null;
        } else {
            this.image = chatImage;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.unReportCount = 0;
        } else {
            this.unReportCount = i5;
        }
        if ((i & 512) == 0) {
            this.parent = null;
        } else {
            this.parent = message;
        }
        if ((i & 1024) == 0) {
            this.deletedParentMessage = null;
        } else {
            this.deletedParentMessage = bool;
        }
        if ((i & a.o) == 0) {
            this.countryFlag = null;
        } else {
            this.countryFlag = str2;
        }
        this.type = (i & 4096) == 0 ? Type.MESSAGE : type;
        this.isServer = (i & 8192) == 0 ? true : z2;
        if ((i & 16384) == 0) {
            this.isLinkify = false;
        } else {
            this.isLinkify = z3;
        }
        if ((32768 & i) == 0) {
            this.isAd = false;
        } else {
            this.isAd = z4;
        }
        this.srcLang = (65536 & i) == 0 ? "" : str3;
        if ((131072 & i) == 0) {
            this.isSanctioned = false;
        } else {
            this.isSanctioned = z5;
        }
        if ((262144 & i) == 0) {
            this.isSystem = false;
        } else {
            this.isSystem = z6;
        }
        if ((524288 & i) == 0) {
            this.isVoted = false;
        } else {
            this.isVoted = z7;
        }
        if ((1048576 & i) == 0) {
            this.isDeleted = false;
        } else {
            this.isDeleted = z8;
        }
        if ((2097152 & i) == 0) {
            this.isReported = false;
        } else {
            this.isReported = z9;
        }
        this.avatarOverrideRes = null;
        if ((4194304 & i) == 0) {
            this.hiddenFor = null;
        } else {
            this.hiddenFor = str4;
        }
        if ((8388608 & i) == 0) {
            this.visibleFor = null;
        } else {
            this.visibleFor = str5;
        }
        if ((i & C.DEFAULT_MUXED_BUFFER_SIZE) == 0) {
            this.trans = null;
        } else {
            this.trans = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        Type[] values = Type.values();
        values.getClass();
        return new qq3("com.sofascore.model.chat.Type", (Enum[]) values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        uhi uhiVar = uhi.a;
        return new q79(uhiVar, uhiVar, 1);
    }

    public static final /* synthetic */ void write$Self$model_release(Message self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.text);
        output.h(serialDesc, 1, ChatUser$$serializer.INSTANCE, self.user);
        output.E(serialDesc, 2, self.timestamp);
        if (output.o(serialDesc) || self.voteCount != 0) {
            output.u(3, self.voteCount, serialDesc);
        }
        if (output.o(serialDesc) || self.reportCount != 0) {
            output.u(4, self.reportCount, serialDesc);
        }
        if (output.o(serialDesc) || self.isAirCashMessage) {
            output.x(serialDesc, 5, self.isAirCashMessage);
        }
        if (output.o(serialDesc) || self.id != 0) {
            output.u(6, self.id, serialDesc);
        }
        if (output.o(serialDesc) || self.image != null) {
            output.h(serialDesc, 7, ChatImage$$serializer.INSTANCE, self.image);
        }
        if (output.o(serialDesc) || self.unReportCount != 0) {
            output.u(8, self.unReportCount, serialDesc);
        }
        if (output.o(serialDesc) || self.parent != null) {
            output.h(serialDesc, 9, Message$$serializer.INSTANCE, self.parent);
        }
        if (output.o(serialDesc) || self.deletedParentMessage != null) {
            output.h(serialDesc, 10, gz1.a, self.deletedParentMessage);
        }
        if (output.o(serialDesc) || self.countryFlag != null) {
            output.h(serialDesc, 11, uhi.a, self.countryFlag);
        }
        if (output.o(serialDesc) || self.type != Type.MESSAGE) {
            output.f(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.type);
        }
        if (output.o(serialDesc) || !self.isServer) {
            output.x(serialDesc, 13, self.isServer);
        }
        if (output.o(serialDesc) || self.isLinkify) {
            output.x(serialDesc, 14, self.isLinkify);
        }
        if (output.o(serialDesc) || self.isAd) {
            output.x(serialDesc, 15, self.isAd);
        }
        if (output.o(serialDesc) || !Intrinsics.c(self.srcLang, "")) {
            output.y(serialDesc, 16, self.srcLang);
        }
        if (output.o(serialDesc) || self.isSanctioned) {
            output.x(serialDesc, 17, self.isSanctioned);
        }
        if (output.o(serialDesc) || self.isSystem) {
            output.x(serialDesc, 18, self.isSystem);
        }
        if (output.o(serialDesc) || self.isVoted) {
            output.x(serialDesc, 19, self.isVoted);
        }
        if (output.o(serialDesc) || self.isDeleted) {
            output.x(serialDesc, 20, self.isDeleted);
        }
        if (output.o(serialDesc) || self.isReported) {
            output.x(serialDesc, 21, self.isReported);
        }
        if (output.o(serialDesc) || self.hiddenFor != null) {
            output.h(serialDesc, 22, uhi.a, self.hiddenFor);
        }
        if (output.o(serialDesc) || self.visibleFor != null) {
            output.h(serialDesc, 23, uhi.a, self.visibleFor);
        }
        if (!output.o(serialDesc) && self.trans == null) {
            return;
        }
        output.h(serialDesc, 24, (KSerializer) joaVarArr[24].getValue(), self.trans);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Message) && this.id == ((Message) other).id;
    }

    @Nullable
    public final Integer getAvatarOverrideRes() {
        return this.avatarOverrideRes;
    }

    @Nullable
    public final String getCountryFlag() {
        return this.countryFlag;
    }

    @Nullable
    public final Boolean getDeletedParentMessage() {
        return this.deletedParentMessage;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final ChatImage getImage() {
        return this.image;
    }

    @Nullable
    public final Message getParent() {
        return this.parent;
    }

    public final int getReportCount() {
        return this.reportCount;
    }

    @NotNull
    public final String getSrcLang() {
        return this.srcLang;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final Map<String, String> getTranslations() {
        Map<String, String> map = this.trans;
        if (map != null) {
            return map;
        }
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return lm5Var;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public final int getUnReportCount() {
        return this.unReportCount;
    }

    @Nullable
    public final ChatUser getUser() {
        return this.user;
    }

    public final int getVoteCount() {
        return this.voteCount;
    }

    public int hashCode() {
        return this.id;
    }

    /* renamed from: isAd, reason: from getter */
    public final boolean getIsAd() {
        return this.isAd;
    }

    /* renamed from: isAirCashMessage, reason: from getter */
    public final boolean getIsAirCashMessage() {
        return this.isAirCashMessage;
    }

    /* renamed from: isDeleted, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    /* renamed from: isLinkify, reason: from getter */
    public final boolean getIsLinkify() {
        return this.isLinkify;
    }

    public final boolean isMessageValid(@NotNull String userId) {
        userId.getClass();
        String str = this.hiddenFor;
        if (str != null && Intrinsics.c(str, userId)) {
            return false;
        }
        String str2 = this.visibleFor;
        return str2 == null || Intrinsics.c(str2, userId);
    }

    /* renamed from: isReported, reason: from getter */
    public final boolean getIsReported() {
        return this.isReported;
    }

    /* renamed from: isSanctioned, reason: from getter */
    public final boolean getIsSanctioned() {
        return this.isSanctioned;
    }

    /* renamed from: isServer, reason: from getter */
    public final boolean getIsServer() {
        return this.isServer;
    }

    /* renamed from: isSystem, reason: from getter */
    public final boolean getIsSystem() {
        return this.isSystem;
    }

    /* renamed from: isVoted, reason: from getter */
    public final boolean getIsVoted() {
        return this.isVoted;
    }

    public final void setAd(boolean z) {
        this.isAd = z;
    }

    public final void setAvatarOverrideRes(@Nullable Integer num) {
        this.avatarOverrideRes = num;
    }

    public final void setImage(@Nullable ChatImage chatImage) {
        this.image = chatImage;
    }

    public final void setLinkify(boolean z) {
        this.isLinkify = z;
    }

    public final void setLocal() {
        this.isServer = false;
    }

    public final void setReportCount(int i) {
        this.reportCount = i;
    }

    public final void setReported(boolean z) {
        this.isReported = z;
    }

    public final void setServer(boolean z) {
        this.isServer = z;
    }

    public final void setSrcLang(@NotNull String str) {
        str.getClass();
        this.srcLang = str;
    }

    public final void setUnReportCount(int i) {
        this.unReportCount = i;
    }

    public final void setVoteCount(int i) {
        this.voteCount = i;
    }

    public final void setVoted(boolean z) {
        this.isVoted = z;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sofascore/model/chat/Message$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/chat/Message;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer getSerializer() {
            return serializer();
        }

        @NotNull
        public final KSerializer serializer() {
            return Message$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAvatarOverrideRes$annotations() {
    }

    @q5h("reports")
    public static /* synthetic */ void getReportCount$annotations() {
    }

    @q5h(L6.q)
    public static /* synthetic */ void getSrcLang$annotations() {
    }

    @q5h("votes")
    public static /* synthetic */ void getVoteCount$annotations() {
    }

    @q5h("deleted")
    public static /* synthetic */ void isDeleted$annotations() {
    }

    @q5h("reported")
    public static /* synthetic */ void isReported$annotations() {
    }

    @q5h("sanctioned")
    public static /* synthetic */ void isSanctioned$annotations() {
    }

    @q5h("system")
    public static /* synthetic */ void isSystem$annotations() {
    }

    @q5h("voted")
    public static /* synthetic */ void isVoted$annotations() {
    }

    public Message(@NotNull String str, @Nullable ChatUser chatUser, long j, int i, int i2, boolean z) {
        str.getClass();
        this.text = str;
        this.user = chatUser;
        this.timestamp = j;
        this.voteCount = i;
        this.reportCount = i2;
        this.isAirCashMessage = z;
        this.type = Type.MESSAGE;
        this.isServer = true;
        this.srcLang = "";
    }

    public /* synthetic */ Message(String str, ChatUser chatUser, long j, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, chatUser, j, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? false : z);
    }
}
