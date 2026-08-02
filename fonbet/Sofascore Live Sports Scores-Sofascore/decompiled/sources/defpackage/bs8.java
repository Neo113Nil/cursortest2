package defpackage;

import androidx.annotation.NonNull;
import com.fyber.inneractive.sdk.external.NativeAdContent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bs8 {
    public static final bs8 a;
    public static final bs8 b;
    public static final bs8 c;
    public static final bs8 d;
    public static final /* synthetic */ bs8[] e;

    static {
        bs8 bs8Var = new bs8("VIDEO_CONTROLS", 0);
        a = bs8Var;
        bs8 bs8Var2 = new bs8("CLOSE_AD", 1);
        b = bs8Var2;
        bs8 bs8Var3 = new bs8("NOT_VISIBLE", 2);
        c = bs8Var3;
        bs8 bs8Var4 = new bs8(NativeAdContent.ViewTag.OTHER, 3);
        d = bs8Var4;
        e = new bs8[]{bs8Var, bs8Var2, bs8Var3, bs8Var4};
    }

    @NonNull
    public static bs8 valueOf(@NonNull String str) {
        return (bs8) Enum.valueOf(bs8.class, str);
    }

    @NonNull
    public static bs8[] values() {
        return (bs8[]) e.clone();
    }
}
