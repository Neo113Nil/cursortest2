package com.vk.stickers.api.styles;

import xsna.c7l0;

/* compiled from: StickerStyleProvider.kt */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: StickerStyleProvider.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final b STUB = new C1790a();

        /* compiled from: StickerStyleProvider.kt */
        /* renamed from: com.vk.stickers.api.styles.b$a$a, reason: collision with other inner class name */
        public static final class C1790a implements b {
            @Override // com.vk.stickers.api.styles.b
            public final com.vk.stickers.api.styles.a a(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var) {
                return com.vk.stickers.api.styles.a.a.getSTUB();
            }

            @Override // com.vk.stickers.api.styles.b
            public final com.vk.stickers.api.styles.a b(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var) {
                return com.vk.stickers.api.styles.a.a.getSTUB();
            }

            @Override // com.vk.stickers.api.styles.b
            public final com.vk.stickers.api.styles.a c(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var) {
                return com.vk.stickers.api.styles.a.a.getSTUB();
            }

            @Override // com.vk.stickers.api.styles.b
            public final com.vk.stickers.api.styles.a d(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var) {
                return com.vk.stickers.api.styles.a.a.getSTUB();
            }
        }

        public final b getSTUB() {
            return STUB;
        }
    }

    /* compiled from: StickerStyleProvider.kt */
    /* renamed from: com.vk.stickers.api.styles.b$b, reason: collision with other inner class name */
    public static final class C1791b {
        public static /* synthetic */ com.vk.stickers.api.styles.a a(b bVar, StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var, int i) {
            if ((i & 1) != 0) {
                stickerCommonStyle = null;
            }
            if ((i & 2) != 0) {
                c7l0Var = null;
            }
            return bVar.a(stickerCommonStyle, c7l0Var);
        }

        public static /* synthetic */ com.vk.stickers.api.styles.a b(b bVar, StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var, int i) {
            if ((i & 1) != 0) {
                stickerCommonStyle = null;
            }
            if ((i & 2) != 0) {
                c7l0Var = null;
            }
            return bVar.c(stickerCommonStyle, c7l0Var);
        }
    }

    com.vk.stickers.api.styles.a a(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var);

    com.vk.stickers.api.styles.a b(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var);

    com.vk.stickers.api.styles.a c(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var);

    com.vk.stickers.api.styles.a d(StickerCommonStyle stickerCommonStyle, c7l0 c7l0Var);
}
