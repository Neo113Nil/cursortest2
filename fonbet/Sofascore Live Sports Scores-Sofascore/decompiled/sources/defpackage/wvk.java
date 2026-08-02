package defpackage;

import androidx.fragment.app.Fragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class wvk extends RuntimeException {
    public final Fragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvk(Fragment fragment, String str) {
        super(str);
        fragment.getClass();
        this.a = fragment;
    }
}
