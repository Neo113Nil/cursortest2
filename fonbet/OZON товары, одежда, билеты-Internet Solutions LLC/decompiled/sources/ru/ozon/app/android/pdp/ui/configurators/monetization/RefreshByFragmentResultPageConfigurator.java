package ru.ozon.app.android.pdp.ui.configurators.monetization;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import B90.C2607i;
import Nk.a;
import Sc.s;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.G;
import androidx.fragment.app.M;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import i10.C6997c;
import i10.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.S;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0017¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\u0007J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0015\u0010\u000bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/monetization/RefreshByFragmentResultPageConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "", "", "extraRequestKeys", "<init>", "(Ljava/util/Set;)V", "()V", "requestKey", "", "refresh", "(Ljava/lang/String;)V", "setResultListener", "urlPath", "(Ljava/lang/String;)Ljava/lang/String;", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onResume", "(Landroidx/lifecycle/J;)V", "onPause", "onRefreshed", "Ljava/util/Set;", "", "isResumed", "Z", "", "refreshOnResumeKeys", "refreshInProgress", "Landroidx/fragment/app/M;", "fragmentResultListener", "Landroidx/fragment/app/M;", "Landroidx/fragment/app/G;", "getFragmentManager", "()Landroidx/fragment/app/G;", "fragmentManager", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class RefreshByFragmentResultPageConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private Set<String> extraRequestKeys;

    @NotNull
    private final M fragmentResultListener;
    private boolean isResumed;
    private boolean refreshInProgress;

    @NotNull
    private final Set<String> refreshOnResumeKeys;

    public RefreshByFragmentResultPageConfigurator(@NotNull Set<String> extraRequestKeys) {
        Intrinsics.checkNotNullParameter(extraRequestKeys, "extraRequestKeys");
        this.extraRequestKeys = extraRequestKeys;
        this.refreshOnResumeKeys = new LinkedHashSet();
        this.fragmentResultListener = new C2607i(this, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fragmentResultListener$lambda$0(RefreshByFragmentResultPageConfigurator refreshByFragmentResultPageConfigurator, String requestKey, Bundle bundle) {
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(bundle, "<unused var>");
        if (refreshByFragmentResultPageConfigurator.isResumed) {
            refreshByFragmentResultPageConfigurator.refresh(requestKey);
        } else {
            refreshByFragmentResultPageConfigurator.refreshOnResumeKeys.add(requestKey);
        }
    }

    private final G getFragmentManager() {
        r a11 = getContainer().a();
        if (a11 != null) {
            return a11.getSupportFragmentManager();
        }
        return null;
    }

    private final void refresh(String requestKey) {
        InterfaceC7851b controller;
        if (!this.refreshInProgress) {
            this.refreshInProgress = true;
            ConfiguratorReferences references = getReferences();
            if (references != null && (controller = references.getController()) != null) {
                InterfaceC7851b.a.a(controller, null, null, null, null, 15);
            }
        }
        onRefreshed(requestKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setResultListener(String requestKey) {
        G fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.r(requestKey);
            fragmentManager.n1(requestKey, getOwner(), this.fragmentResultListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String urlPath(String str) {
        Uri parse = Uri.parse(str);
        S s11 = new S(2);
        s11.a(parse.getAuthority());
        List<String> pathSegments = parse.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        s11.b(pathSegments.toArray(new String[0]));
        Object[] elements = s11.d(new String[s11.c()]);
        Intrinsics.checkNotNullParameter(elements, "elements");
        String b11 = a.b("/", C7714v.V(C7705l.B(elements), "/", null, null, null, 62));
        if (b11.length() > 0) {
            return b11;
        }
        return null;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        InterfaceC7851b controller;
        final InterfaceC2395h<A00.a> eventsFlow;
        ConfiguratorReferences references = getReferences();
        if (references != null && (controller = references.getController()) != null && (eventsFlow = controller.getEventsFlow()) != null) {
            C2399j.C(new C2408n0(new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$$inlined$filterIsInstance$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$$inlined$filterIsInstance$1$2", f = "RefreshByFragmentResultPageConfigurator.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends c {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= LinearLayoutManager.INVALID_OFFSET;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                        this.$this_unsafeFlow = interfaceC2397i;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    if (obj instanceof a.C2370k) {
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                }
                                return Unit.f71690a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(dVar);
                        Object obj22 = anonymousClass1.result;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                    return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            }, new RefreshByFragmentResultPageConfigurator$onComposerInitialized$1(this, null)), K.a(getOwner()));
        }
        ConfiguratorReferences references2 = getReferences();
        if (references2 != null) {
            final InterfaceC2395h<C6997c<l>> state = ((RetainComposerComponentApi) references2.getComposerWidgetComponentStorage().getComponent(RetainComposerComponentApi.class)).getComposerStore().getState();
            final InterfaceC2395h<h.c> interfaceC2395h = new InterfaceC2395h<h.c>() { // from class: ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$lambda$3$$inlined$map$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$lambda$3$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$lambda$3$$inlined$map$1$2", f = "RefreshByFragmentResultPageConfigurator.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends c {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= LinearLayoutManager.INVALID_OFFSET;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                        this.$this_unsafeFlow = interfaceC2397i;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    h.c d11 = ((C6997c) obj).l().d();
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(d11, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                }
                                return Unit.f71690a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(dVar);
                        Object obj22 = anonymousClass1.result;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super h.c> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                    return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            };
            final InterfaceC2395h<Object> interfaceC2395h2 = new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$lambda$3$$inlined$filterIsInstance$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$lambda$3$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$lambda$3$$inlined$filterIsInstance$1$2", f = "RefreshByFragmentResultPageConfigurator.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$lambda$3$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends c {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= LinearLayoutManager.INVALID_OFFSET;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                        this.$this_unsafeFlow = interfaceC2397i;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    if (obj instanceof h.c.a) {
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                }
                                return Unit.f71690a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(dVar);
                        Object obj22 = anonymousClass1.result;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                    return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            };
            C2399j.C(new C2408n0(C2399j.o(new InterfaceC2395h<String>() { // from class: ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$lambda$3$$inlined$mapNotNull$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$lambda$3$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                    final /* synthetic */ RefreshByFragmentResultPageConfigurator this$0;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$lambda$3$$inlined$mapNotNull$1$2", f = "RefreshByFragmentResultPageConfigurator.kt", l = {52}, m = "emit")
                    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator$onComposerInitialized$lambda$3$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends c {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= LinearLayoutManager.INVALID_OFFSET;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i, RefreshByFragmentResultPageConfigurator refreshByFragmentResultPageConfigurator) {
                        this.$this_unsafeFlow = interfaceC2397i;
                        this.this$0 = refreshByFragmentResultPageConfigurator;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        String urlPath;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    urlPath = this.this$0.urlPath(((h.c.a) obj).f());
                                    if (urlPath != null) {
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(urlPath, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                }
                                return Unit.f71690a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(dVar);
                        Object obj22 = anonymousClass1.result;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super String> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                    return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            }), new RefreshByFragmentResultPageConfigurator$onComposerInitialized$2$3(this, null)), K.a(getOwner()));
        }
        Iterator<T> it = this.extraRequestKeys.iterator();
        while (it.hasNext()) {
            setResultListener((String) it.next());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.isResumed = false;
    }

    protected void onRefreshed(@NotNull String requestKey) {
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Iterator<T> it = this.refreshOnResumeKeys.iterator();
        while (it.hasNext()) {
            refresh((String) it.next());
        }
        this.isResumed = true;
    }

    public RefreshByFragmentResultPageConfigurator() {
        this(kotlin.collections.M.f71699a);
    }
}
