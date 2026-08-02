package com.vk.ecomm.market.album.editor.cover.presentation;

import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import xsna.epx;

/* compiled from: MarketEditAlbumSideEffects.kt */
/* loaded from: classes18.dex */
public interface b {

    /* compiled from: MarketEditAlbumSideEffects.kt */
    public static final class a implements b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1263182395;
        }

        public final String toString() {
            return "Finish";
        }
    }

    /* compiled from: MarketEditAlbumSideEffects.kt */
    /* renamed from: com.vk.ecomm.market.album.editor.cover.presentation.b$b, reason: collision with other inner class name */
    public static final class C0941b implements b {
        public final GoodAlbumEditFlowEntity a;

        public C0941b(GoodAlbumEditFlowEntity goodAlbumEditFlowEntity) {
            this.a = goodAlbumEditFlowEntity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0941b) && epx.f(this.a, ((C0941b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "FinishWithResult(album=" + this.a + ')';
        }
    }
}
