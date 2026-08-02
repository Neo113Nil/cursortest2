package com.vk.dialogssearch.api.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.im.engine.ChannelSource;
import io.reactivex.rxjava3.internal.operators.completable.i;
import xsna.obb;

/* compiled from: ChannelSearchListComponent.kt */
/* loaded from: classes18.dex */
public interface ChannelSearchListComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: ChannelSearchListComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ChannelSearchListComponent STUB = new ChannelSearchListComponent() { // from class: com.vk.dialogssearch.api.di.ChannelSearchListComponent$Companion$STUB$1
            public final a a = new a();

            /* compiled from: ChannelSearchListComponent.kt */
            public static final class a implements obb {
                @Override // xsna.obb
                public final io.reactivex.rxjava3.core.a a(long j) {
                    return i.b;
                }

                @Override // xsna.obb
                public final io.reactivex.rxjava3.core.a b(long j, ChannelSource channelSource) {
                    return i.b;
                }
            }

            @Override // com.vk.dialogssearch.api.di.ChannelSearchListComponent
            public final obb Pe() {
                return this.a;
            }
        };

        public final ChannelSearchListComponent getSTUB() {
            return STUB;
        }
    }

    obb Pe();
}
