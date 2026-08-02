package ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import Sc.InterfaceC4008j;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b00.f;
import d00.C6018d;
import e3.C6285b;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData.BloggerPersonalDataFormViewModel;
import ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData.SubmitBloggerPersonalDataActionHandler;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core.BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.data.BloggerPersonalDataFormDTO;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.di.BloggerPersonalDataFormComponent;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.presentation.BloggerPersonalDataFormContentKt;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.presentation.BloggerPersonalDataFormOverlayKt;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.presentation.BloggerPersonalDataFormVI;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1 extends AbstractC7737t implements Function1<C6018d<BloggerPersonalDataFormDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core.BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<BloggerPersonalDataFormDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core.BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C17891 extends AbstractC7737t implements Function1<C7244b, BloggerPersonalDataFormDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17891(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final BloggerPersonalDataFormDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (BloggerPersonalDataFormDTO) this.$jsonDeserializer.fromJson(it.b(), BloggerPersonalDataFormDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<BloggerPersonalDataFormDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<BloggerPersonalDataFormDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C17891(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Content;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core.BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<BloggerPersonalDataFormDTO, BloggerPersonalDataFormVI.Content>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Content;", "invoke", "(Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core.BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<BloggerPersonalDataFormDTO, d, List<? extends BloggerPersonalDataFormVI.Content>> {
            final /* synthetic */ InterfaceC4008j<BloggerPersonalDataFormComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(InterfaceC4008j<? extends BloggerPersonalDataFormComponent> interfaceC4008j) {
                super(2);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<BloggerPersonalDataFormVI.Content> invoke(BloggerPersonalDataFormDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return AnonymousClass2.invoke$lambda$0(this.$component$delegate).getContentMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Content;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core.BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C17902 extends AbstractC7737t implements Function1<k<BloggerPersonalDataFormVI.Content>, Unit> {
            final /* synthetic */ InterfaceC4008j<BloggerPersonalDataFormComponent> $component$delegate;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Content;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core.BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<BloggerPersonalDataFormVI.Content>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<BloggerPersonalDataFormComponent> $component$delegate;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(InterfaceC4008j<? extends BloggerPersonalDataFormComponent> interfaceC4008j) {
                    super(4);
                    this.$component$delegate = interfaceC4008j;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<BloggerPersonalDataFormVI.Content> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<BloggerPersonalDataFormVI.Content> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    h hVar = (h) interfaceC3967k.m(f.f());
                    final InterfaceC4008j<BloggerPersonalDataFormComponent> interfaceC4008j = this.$component$delegate;
                    BloggerPersonalDataFormViewModel bloggerPersonalDataFormViewModel = (BloggerPersonalDataFormViewModel) new z0(hVar.a(), new z0.c() { // from class: ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core.BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$2$2$1$invoke$$inlined$viewModel$1
                        @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                        public <T extends w0> T create(Class<T> modelClass) {
                            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                            BloggerPersonalDataFormViewModel bloggerPersonalDataFormViewModel2 = BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1.AnonymousClass2.invoke$lambda$0(InterfaceC4008j.this).getViewModelProvider().get();
                            Intrinsics.g(bloggerPersonalDataFormViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                            return bloggerPersonalDataFormViewModel2;
                        }
                    }).a(BloggerPersonalDataFormViewModel.class);
                    InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(f.c());
                    interfaceC3967k.o(1468930408);
                    boolean F11 = interfaceC3967k.F(interfaceC7851b) | interfaceC3967k.F(bloggerPersonalDataFormViewModel);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$2$2$1$1$1(interfaceC7851b, bloggerPersonalDataFormViewModel, null);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, interfaceC7851b, (Function2) C11);
                    interfaceC3967k.G(1468940498, content.b());
                    List<BloggerPersonalDataFormVI.View> views = content.b().getViews();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : views) {
                        if (obj instanceof BloggerPersonalDataFormVI.View.Input) {
                            arrayList.add(obj);
                        }
                    }
                    int h11 = U.h(C7714v.z(arrayList, 10));
                    if (h11 < 16) {
                        h11 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        BloggerPersonalDataFormVI.View.Input input = (BloggerPersonalDataFormVI.View.Input) it2.next();
                        Pair pair = new Pair(input.getName(), input.getInitialState());
                        linkedHashMap.put(pair.e(), pair.f());
                    }
                    bloggerPersonalDataFormViewModel.onWidgetInputsUpdated(linkedHashMap);
                    interfaceC3967k.J();
                    List<BloggerPersonalDataFormVI.View> views2 = content.b().getViews();
                    InterfaceC3978p0 c11 = C6285b.c(bloggerPersonalDataFormViewModel.getInputs(), interfaceC3967k, 0);
                    interfaceC3967k.o(1468955858);
                    boolean F12 = interfaceC3967k.F(bloggerPersonalDataFormViewModel);
                    Object C12 = interfaceC3967k.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$2$2$1$3$1(bloggerPersonalDataFormViewModel);
                        interfaceC3967k.x(C12);
                    }
                    interfaceC3967k.k();
                    BloggerPersonalDataFormContentKt.BloggerPersonalDataFormContent(views2, c11, (Function2) C12, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C17902(InterfaceC4008j<? extends BloggerPersonalDataFormComponent> interfaceC4008j) {
                super(1);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<BloggerPersonalDataFormVI.Content> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<BloggerPersonalDataFormVI.Content> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 655753670, new AnonymousClass1(this.$component$delegate)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BloggerPersonalDataFormComponent invoke$lambda$0(InterfaceC4008j<? extends BloggerPersonalDataFormComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<BloggerPersonalDataFormDTO, BloggerPersonalDataFormVI.Content> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<BloggerPersonalDataFormDTO, BloggerPersonalDataFormVI.Content> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            InterfaceC4008j b11 = Sc.k.b(new BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$2$component$2(viewMapper));
            c.j(viewMapper, null, new AnonymousClass1(b11), 1, null);
            viewMapper.G(new C17902(b11));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Overlay;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core.BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<e<BloggerPersonalDataFormDTO, BloggerPersonalDataFormVI.Overlay>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Overlay;", "invoke", "(Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core.BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<BloggerPersonalDataFormDTO, d, List<? extends BloggerPersonalDataFormVI.Overlay>> {
            final /* synthetic */ InterfaceC4008j<BloggerPersonalDataFormComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(InterfaceC4008j<? extends BloggerPersonalDataFormComponent> interfaceC4008j) {
                super(2);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<BloggerPersonalDataFormVI.Overlay> invoke(BloggerPersonalDataFormDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return AnonymousClass3.invoke$lambda$0(this.$component$delegate).getOverlayMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Overlay;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core.BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.overlay.f<BloggerPersonalDataFormVI.Overlay>, Unit> {
            final /* synthetic */ InterfaceC4008j<BloggerPersonalDataFormComponent> $component$delegate;
            final /* synthetic */ e<BloggerPersonalDataFormDTO, BloggerPersonalDataFormVI.Overlay> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Overlay;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core.BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<BloggerPersonalDataFormVI.Overlay>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<BloggerPersonalDataFormComponent> $component$delegate;
                final /* synthetic */ e<BloggerPersonalDataFormDTO, BloggerPersonalDataFormVI.Overlay> $this_overlayViewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(e<BloggerPersonalDataFormDTO, BloggerPersonalDataFormVI.Overlay> eVar, InterfaceC4008j<? extends BloggerPersonalDataFormComponent> interfaceC4008j) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                    this.$component$delegate = interfaceC4008j;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<BloggerPersonalDataFormVI.Overlay> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<BloggerPersonalDataFormVI.Overlay> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        BloggerPersonalDataFormOverlayKt.BloggerPersonalDataFormBottomOverlay(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), AnonymousClass3.invoke$lambda$0(this.$component$delegate).getCustomActionHandlersStoreFactory().create(SubmitBloggerPersonalDataActionHandler.class))), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(e<BloggerPersonalDataFormDTO, BloggerPersonalDataFormVI.Overlay> eVar, InterfaceC4008j<? extends BloggerPersonalDataFormComponent> interfaceC4008j) {
                super(1);
                this.$this_overlayViewMapper = eVar;
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ru.ozon.composer.compose.widget.overlay.f<BloggerPersonalDataFormVI.Overlay> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ru.ozon.composer.compose.widget.overlay.f<BloggerPersonalDataFormVI.Overlay> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 786134290, new AnonymousClass1(this.$this_overlayViewMapper, this.$component$delegate)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BloggerPersonalDataFormComponent invoke$lambda$0(InterfaceC4008j<? extends BloggerPersonalDataFormComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<BloggerPersonalDataFormDTO, BloggerPersonalDataFormVI.Overlay> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<BloggerPersonalDataFormDTO, BloggerPersonalDataFormVI.Overlay> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            InterfaceC4008j b11 = Sc.k.b(new BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$3$component$2(overlayViewMapper));
            c.j(overlayViewMapper, null, new AnonymousClass1(b11), 1, null);
            overlayViewMapper.s(d.a.f94674b, new AnonymousClass2(overlayViewMapper, b11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<BloggerPersonalDataFormDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<BloggerPersonalDataFormDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.l(AnonymousClass3.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core.BloggerPersonalDataFormWidgetKt$BloggerPersonalDataFormWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return BloggerPersonalDataFormComponent.INSTANCE.create(it);
            }
        });
    }
}
