package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.color.AspectsCompactV2ColorMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.color.VariantsMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.footer.AspectV2FooterMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.header.AspectV2HeaderMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.image.AspectsCompactV2ImageMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.media.AspectsCompactV2MediaMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.pack.AspectsCompactV2PackMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.text.AspectsCompactV2TextMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.textIcon.AspectsCompactV2TextIconMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.tiles.AspectsCompactV2TilesMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di.AspectsCompactV2WidgetComponent;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.imagetitle.AspectsV2ImageTitleMapper;

/* loaded from: classes13.dex */
public final class DaggerAspectsCompactV2WidgetComponent {

    private static final class AspectsCompactV2WidgetComponentImpl implements AspectsCompactV2WidgetComponent {
        private a<AspectV2FooterMapper> aspectV2FooterMapperProvider;
        private a<AspectV2HeaderMapper> aspectV2HeaderMapperProvider;
        private a<AspectsCompactV2ColorMapper> aspectsCompactV2ColorMapperProvider;
        private a<AspectsCompactV2ImageMapper> aspectsCompactV2ImageMapperProvider;
        private a<AspectsCompactV2TextMapper> aspectsCompactV2TextMapperProvider;
        private final AspectsCompactV2WidgetComponentImpl aspectsCompactV2WidgetComponentImpl;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<VariantsMapper> variantsMapperProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AspectsCompactV2WidgetComponentImpl aspectsCompactV2WidgetComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f93049id;

            SwitchingProvider(AspectsCompactV2WidgetComponentImpl aspectsCompactV2WidgetComponentImpl, int i11) {
                this.aspectsCompactV2WidgetComponentImpl = aspectsCompactV2WidgetComponentImpl;
                this.f93049id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f93049id;
                if (i11 == 0) {
                    Context context = this.aspectsCompactV2WidgetComponentImpl.contextComponentDependencies.getContext();
                    j.c(context);
                    return (T) new VariantsMapper(context);
                }
                if (i11 == 1) {
                    return (T) new AspectsCompactV2TextMapper((VariantsMapper) this.aspectsCompactV2WidgetComponentImpl.variantsMapperProvider.get());
                }
                if (i11 == 2) {
                    Context context2 = this.aspectsCompactV2WidgetComponentImpl.contextComponentDependencies.getContext();
                    j.c(context2);
                    return (T) new AspectsCompactV2ImageMapper(context2, (VariantsMapper) this.aspectsCompactV2WidgetComponentImpl.variantsMapperProvider.get());
                }
                if (i11 == 3) {
                    Context context3 = this.aspectsCompactV2WidgetComponentImpl.contextComponentDependencies.getContext();
                    j.c(context3);
                    return (T) new AspectsCompactV2ColorMapper(context3, (VariantsMapper) this.aspectsCompactV2WidgetComponentImpl.variantsMapperProvider.get());
                }
                if (i11 == 4) {
                    return (T) new AspectV2HeaderMapper();
                }
                if (i11 == 5) {
                    return (T) new AspectV2FooterMapper();
                }
                throw new AssertionError(this.f93049id);
            }
        }

        /* synthetic */ AspectsCompactV2WidgetComponentImpl(ContextComponentDependencies contextComponentDependencies, int i11) {
            this(contextComponentDependencies);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies) {
            this.variantsMapperProvider = d.b(new SwitchingProvider(this.aspectsCompactV2WidgetComponentImpl, 0));
            this.aspectsCompactV2TextMapperProvider = d.b(new SwitchingProvider(this.aspectsCompactV2WidgetComponentImpl, 1));
            this.aspectsCompactV2ImageMapperProvider = d.b(new SwitchingProvider(this.aspectsCompactV2WidgetComponentImpl, 2));
            this.aspectsCompactV2ColorMapperProvider = d.b(new SwitchingProvider(this.aspectsCompactV2WidgetComponentImpl, 3));
            this.aspectV2HeaderMapperProvider = d.b(new SwitchingProvider(this.aspectsCompactV2WidgetComponentImpl, 4));
            this.aspectV2FooterMapperProvider = d.b(new SwitchingProvider(this.aspectsCompactV2WidgetComponentImpl, 5));
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di.AspectsCompactV2WidgetComponent
        public AspectsCompactV2ColorMapper getColorMapper() {
            return this.aspectsCompactV2ColorMapperProvider.get();
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di.AspectsCompactV2WidgetComponent
        public AspectV2FooterMapper getFooterMapper() {
            return this.aspectV2FooterMapperProvider.get();
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di.AspectsCompactV2WidgetComponent
        public AspectV2HeaderMapper getHeaderMapper() {
            return this.aspectV2HeaderMapperProvider.get();
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di.AspectsCompactV2WidgetComponent
        public AspectsCompactV2ImageMapper getImageMapper() {
            return this.aspectsCompactV2ImageMapperProvider.get();
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di.AspectsCompactV2WidgetComponent
        public AspectsV2ImageTitleMapper getImageTitleMapper() {
            VariantsMapper variantsMapper = this.variantsMapperProvider.get();
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new AspectsV2ImageTitleMapper(variantsMapper, context);
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di.AspectsCompactV2WidgetComponent
        public AspectsCompactV2MediaMapper getMediaMapper() {
            return new AspectsCompactV2MediaMapper(this.variantsMapperProvider.get());
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di.AspectsCompactV2WidgetComponent
        public AspectsCompactV2PackMapper getPackManager() {
            return new AspectsCompactV2PackMapper(this.variantsMapperProvider.get());
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di.AspectsCompactV2WidgetComponent
        public AspectsCompactV2TextIconMapper getTextIconMapper() {
            return new AspectsCompactV2TextIconMapper(this.variantsMapperProvider.get());
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di.AspectsCompactV2WidgetComponent
        public AspectsCompactV2TextMapper getTextMapper() {
            return this.aspectsCompactV2TextMapperProvider.get();
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di.AspectsCompactV2WidgetComponent
        public AspectsCompactV2TilesMapper getTilesMapper() {
            return new AspectsCompactV2TilesMapper(this.variantsMapperProvider.get());
        }

        private AspectsCompactV2WidgetComponentImpl(ContextComponentDependencies contextComponentDependencies) {
            this.aspectsCompactV2WidgetComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            initialize(contextComponentDependencies);
        }
    }

    private static final class Factory implements AspectsCompactV2WidgetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di.AspectsCompactV2WidgetComponent.Factory
        public AspectsCompactV2WidgetComponent create(ContextComponentDependencies contextComponentDependencies) {
            contextComponentDependencies.getClass();
            return new AspectsCompactV2WidgetComponentImpl(contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    public static AspectsCompactV2WidgetComponent.Factory factory() {
        return new Factory(0);
    }
}
