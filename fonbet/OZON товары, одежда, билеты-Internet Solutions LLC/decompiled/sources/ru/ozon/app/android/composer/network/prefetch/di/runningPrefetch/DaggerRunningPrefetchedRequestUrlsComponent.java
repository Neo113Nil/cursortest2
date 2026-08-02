package ru.ozon.app.android.composer.network.prefetch.di.runningPrefetch;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolder;
import ru.ozon.app.android.composer.network.prefetch.ComposerRunningPrefetchedRequestUrlsHolderImpl;

/* loaded from: classes6.dex */
public final class DaggerRunningPrefetchedRequestUrlsComponent {

    public static final class Builder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public RunningPrefetchedRequestUrlsComponent build() {
            return new RunningPrefetchedRequestUrlsComponentImpl(0);
        }

        private Builder() {
        }
    }

    private static final class RunningPrefetchedRequestUrlsComponentImpl implements RunningPrefetchedRequestUrlsComponent {
        private a<ComposerRunningPrefetchedRequestUrlsHolder> bindComposerRunningPrefetchedRequestUrlsHolderProvider;
        private a<ComposerRunningPrefetchedRequestUrlsHolderImpl> composerRunningPrefetchedRequestUrlsHolderImplProvider;
        private final RunningPrefetchedRequestUrlsComponentImpl runningPrefetchedRequestUrlsComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92477id;
            private final RunningPrefetchedRequestUrlsComponentImpl runningPrefetchedRequestUrlsComponentImpl;

            SwitchingProvider(RunningPrefetchedRequestUrlsComponentImpl runningPrefetchedRequestUrlsComponentImpl, int i11) {
                this.runningPrefetchedRequestUrlsComponentImpl = runningPrefetchedRequestUrlsComponentImpl;
                this.f92477id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92477id == 0) {
                    return (T) new ComposerRunningPrefetchedRequestUrlsHolderImpl();
                }
                throw new AssertionError(this.f92477id);
            }
        }

        /* synthetic */ RunningPrefetchedRequestUrlsComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.runningPrefetchedRequestUrlsComponentImpl, 0);
            this.composerRunningPrefetchedRequestUrlsHolderImplProvider = switchingProvider;
            this.bindComposerRunningPrefetchedRequestUrlsHolderProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.composer.network.prefetch.di.runningPrefetch.RunningPrefetchedRequestUrlsComponentApi
        public ComposerRunningPrefetchedRequestUrlsHolder getRunningPrefetchedRequestUrlsHolder() {
            return this.bindComposerRunningPrefetchedRequestUrlsHolderProvider.get();
        }

        private RunningPrefetchedRequestUrlsComponentImpl() {
            this.runningPrefetchedRequestUrlsComponentImpl = this;
            initialize();
        }
    }

    public static RunningPrefetchedRequestUrlsComponent create() {
        return new Builder(0).build();
    }
}
