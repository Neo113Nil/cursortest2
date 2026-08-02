package com.vk.catalog.mvi.block.video.impl.movies.detail.description;

import com.vk.catalog.mvi.block.BlockId;
import xsna.epx;
import xsna.q1a;

/* compiled from: MovieDescriptionView.kt */
/* loaded from: classes16.dex */
public interface a extends q1a {

    /* compiled from: MovieDescriptionView.kt */
    /* renamed from: com.vk.catalog.mvi.block.video.impl.movies.detail.description.a$a, reason: collision with other inner class name */
    public static final class C0460a implements a {
        public final BlockId b;

        public C0460a(BlockId blockId) {
            this.b = blockId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0460a) && epx.f(this.b, ((C0460a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Toggled(blockId=" + this.b + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }
}
