package com.moloco.sdk.internal.ortb.model;

import com.braze.Constants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/u;", "", "<init>", "(Ljava/lang/String;I)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "b", "c", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "e", "f", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes7.dex */
public final class u {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Lazy<KSerializer<Object>> a;

    @SerialName(TtmlNode.START)
    public static final u b = new u("Start", 0);

    @SerialName(TtmlNode.CENTER)
    public static final u c = new u("Center", 1);

    @SerialName(TtmlNode.END)
    public static final u d = new u("End", 2);

    @SerialName("left")
    public static final u e = new u("Left", 3);

    @SerialName(TtmlNode.RIGHT)
    public static final u f = new u("Right", 4);
    public static final /* synthetic */ u[] g;
    public static final /* synthetic */ EnumEntries h;

    /* renamed from: com.moloco.sdk.internal.ortb.model.u$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ KSerializer a() {
            return (KSerializer) u.a.getValue();
        }

        public final KSerializer<u> serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        u[] a2 = a();
        g = a2;
        h = EnumEntriesKt.enumEntries(a2);
        INSTANCE = new Companion(null);
        a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.moloco.sdk.internal.ortb.model.u$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer createAnnotatedEnumSerializer;
                createAnnotatedEnumSerializer = EnumsKt.createAnnotatedEnumSerializer("com.moloco.sdk.internal.ortb.model.HorizontalAlignment", u.values(), new String[]{TtmlNode.START, TtmlNode.CENTER, TtmlNode.END, "left", TtmlNode.RIGHT}, new Annotation[][]{null, null, null, null, null}, null);
                return createAnnotatedEnumSerializer;
            }
        });
    }

    public u(String str, int i) {
    }

    public static final /* synthetic */ u[] a() {
        return new u[]{b, c, d, e, f};
    }

    public static EnumEntries<u> d() {
        return h;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) g.clone();
    }
}
