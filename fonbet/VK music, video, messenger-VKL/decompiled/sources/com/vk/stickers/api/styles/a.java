package com.vk.stickers.api.styles;

import android.content.Context;
import xsna.v2l0;

/* compiled from: IStyleInfo.kt */
/* loaded from: classes5.dex */
public interface a {
    public static final C1788a a = C1788a.a;

    void b(v2l0 v2l0Var);

    StickerCommonStyle c();

    boolean d();

    a e();

    Integer f();

    int g(Context context);

    int h(Context context);

    /* compiled from: IStyleInfo.kt */
    /* renamed from: com.vk.stickers.api.styles.a$a, reason: collision with other inner class name */
    public static final class C1788a {
        public static final /* synthetic */ C1788a a = new C1788a();
        private static final a STUB = new C1789a();

        public final a getSTUB() {
            return STUB;
        }

        /* compiled from: IStyleInfo.kt */
        /* renamed from: com.vk.stickers.api.styles.a$a$a, reason: collision with other inner class name */
        public static final class C1789a implements a {
            public final StickerCommonStyle b;

            public C1789a() {
                StickerCommonStyle.Companion.getClass();
                this.b = StickerCommonStyle.ACCENT_CONTENT;
            }

            @Override // com.vk.stickers.api.styles.a
            public final StickerCommonStyle c() {
                return this.b;
            }

            @Override // com.vk.stickers.api.styles.a
            public final boolean d() {
                return false;
            }

            @Override // com.vk.stickers.api.styles.a
            public final Integer f() {
                return 0;
            }

            @Override // com.vk.stickers.api.styles.a
            public final int g(Context context) {
                return 0;
            }

            @Override // com.vk.stickers.api.styles.a
            public final int h(Context context) {
                return 0;
            }

            @Override // com.vk.stickers.api.styles.a
            public final a e() {
                return this;
            }

            @Override // com.vk.stickers.api.styles.a
            public final void b(v2l0 v2l0Var) {
            }
        }
    }
}
