package ru.ozon.app.android.product.common.richheader;

import Jb.j;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.viewutils.RecycledViewPoolViewNullifier;
import ru.ozon.app.android.product.common.richheader.RichHeaderComponent;

/* loaded from: classes13.dex */
public final class DaggerRichHeaderComponent {

    private static final class Factory implements RichHeaderComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.product.common.richheader.RichHeaderComponent.Factory
        public RichHeaderComponent create(AndroidPlatformComponentApi androidPlatformComponentApi) {
            androidPlatformComponentApi.getClass();
            return new RichHeaderComponentImpl(androidPlatformComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class RichHeaderComponentImpl implements RichHeaderComponent {
        private final AndroidPlatformComponentApi androidPlatformComponentApi;
        private final RichHeaderComponentImpl richHeaderComponentImpl;

        /* synthetic */ RichHeaderComponentImpl(AndroidPlatformComponentApi androidPlatformComponentApi, int i11) {
            this(androidPlatformComponentApi);
        }

        @Override // ru.ozon.app.android.product.common.richheader.RichHeaderComponent
        public RecycledViewPoolViewNullifier getRecycledViewPoolViewNullifier() {
            RecycledViewPoolViewNullifier recyclerViewPoolNullifier = this.androidPlatformComponentApi.recyclerViewPoolNullifier();
            j.c(recyclerViewPoolNullifier);
            return recyclerViewPoolNullifier;
        }

        private RichHeaderComponentImpl(AndroidPlatformComponentApi androidPlatformComponentApi) {
            this.richHeaderComponentImpl = this;
            this.androidPlatformComponentApi = androidPlatformComponentApi;
        }
    }

    public static RichHeaderComponent.Factory factory() {
        return new Factory(0);
    }
}
