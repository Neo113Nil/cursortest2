package ru.ozon.app.android.video.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.video.player.CdnChooserSdkVideoService;
import ru.ozon.app.android.video.player.CdnChooserSdkVideoServiceImpl;

/* loaded from: classes7.dex */
public final class DaggerCdnVideoComponent {

    public static final class Builder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public CdnVideoComponent build() {
            return new CdnVideoComponentImpl(0);
        }

        private Builder() {
        }
    }

    private static final class CdnVideoComponentImpl implements CdnVideoComponent {
        private a<CdnChooserSdkVideoService> bindCdnChooserSdkVideoServiceProvider;
        private a<CdnChooserSdkVideoServiceImpl> cdnChooserSdkVideoServiceImplProvider;
        private final CdnVideoComponentImpl cdnVideoComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CdnVideoComponentImpl cdnVideoComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f94582id;

            SwitchingProvider(CdnVideoComponentImpl cdnVideoComponentImpl, int i11) {
                this.cdnVideoComponentImpl = cdnVideoComponentImpl;
                this.f94582id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f94582id == 0) {
                    return (T) new CdnChooserSdkVideoServiceImpl();
                }
                throw new AssertionError(this.f94582id);
            }
        }

        /* synthetic */ CdnVideoComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.cdnVideoComponentImpl, 0);
            this.cdnChooserSdkVideoServiceImplProvider = switchingProvider;
            this.bindCdnChooserSdkVideoServiceProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.video.di.CdnVideoComponentApi
        public CdnChooserSdkVideoService getCdnChooserSdkVideoService() {
            return this.bindCdnChooserSdkVideoServiceProvider.get();
        }

        private CdnVideoComponentImpl() {
            this.cdnVideoComponentImpl = this;
            initialize();
        }
    }

    public static CdnVideoComponent create() {
        return new Builder(0).build();
    }
}
