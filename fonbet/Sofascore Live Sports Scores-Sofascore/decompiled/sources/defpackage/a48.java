package defpackage;

import com.google.firebase.inappmessaging.model.MessageType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class a48 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MessageType.values().length];
        a = iArr;
        try {
            iArr[MessageType.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[MessageType.MODAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[MessageType.IMAGE_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[MessageType.CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
