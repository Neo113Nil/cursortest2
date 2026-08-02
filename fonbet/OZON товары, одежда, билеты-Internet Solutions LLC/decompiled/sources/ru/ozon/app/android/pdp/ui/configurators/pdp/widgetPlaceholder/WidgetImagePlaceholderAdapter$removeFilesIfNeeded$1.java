package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder;

import Sc.s;
import Wc.a;
import a00.C4908c;
import a00.C4911f;
import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.I;
import androidx.recyclerview.widget.m;
import java.io.File;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter$removeFilesIfNeeded$1", f = "WidgetImagePlaceholderAdapter.kt", l = {423}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class WidgetImagePlaceholderAdapter$removeFilesIfNeeded$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ WidgetImagePlaceholderAdapter this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter$removeFilesIfNeeded$1$4", f = "WidgetImagePlaceholderAdapter.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter$removeFilesIfNeeded$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ WidgetImagePlaceholderAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, d<? super AnonymousClass4> dVar) {
            super(2, dVar);
            this.this$0 = widgetImagePlaceholderAdapter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass4(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4911f c4911f;
            C4908c g10;
            AbstractC5434v lifecycle;
            I i11;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            c4911f = this.this$0.ownerContainer;
            if (c4911f != null && (g10 = c4911f.g()) != null && (lifecycle = g10.getLifecycle()) != null) {
                i11 = this.this$0.lifecycleObserver;
                lifecycle.e(i11);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass4) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetImagePlaceholderAdapter$removeFilesIfNeeded$1(WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, Context context, d<? super WidgetImagePlaceholderAdapter$removeFilesIfNeeded$1> dVar) {
        super(2, dVar);
        this.this$0 = widgetImagePlaceholderAdapter;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new WidgetImagePlaceholderAdapter$removeFilesIfNeeded$1(this.this$0, this.$context, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r10 = r9.this$0.sku;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        J j11;
        File file;
        String name;
        boolean currentInCartState;
        String str;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            z11 = this.this$0.isFavorite;
            if (!z11) {
                currentInCartState = this.this$0.currentInCartState();
                if (!currentInCartState && str != null) {
                    this.this$0.removeDirectoryAndFiles(this.$context, str);
                }
            }
            File file2 = new File(this.$context.getFilesDir(), "PdpWidgetJsonStorage");
            File[] listFiles = file2.listFiles();
            if (listFiles != null) {
                Integer num = new Integer(listFiles.length);
                int intValue = num.intValue();
                if (intValue == 0 || intValue <= 200) {
                    num = null;
                }
                if (num != null) {
                    WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter = this.this$0;
                    Context context = this.$context;
                    int intValue2 = num.intValue() - m.e.DEFAULT_DRAG_ANIMATION_DURATION;
                    for (int i12 = 0; i12 < intValue2; i12++) {
                        File[] listFiles2 = file2.listFiles();
                        if (listFiles2 != null && listFiles2.length > 1) {
                            C7705l.a0(listFiles2, new Comparator() { // from class: ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter$removeFilesIfNeeded$1$invokeSuspend$lambda$5$lambda$4$$inlined$sortBy$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t2, T t11) {
                                    return Vc.a.b(Long.valueOf(((File) t2).lastModified()), Long.valueOf(((File) t11).lastModified()));
                                }
                            });
                        }
                        if (listFiles2 != null && (file = (File) C7705l.C(listFiles2)) != null && (name = file.getName()) != null) {
                            widgetImagePlaceholderAdapter.removeDirectoryAndFiles(context, name);
                        }
                    }
                }
            }
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 l02 = De.s.f6650a;
            j11 = this.this$0.exceptionHandler;
            CoroutineContext plus = l02.plus(j11);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
            this.label = 1;
            if (C10727i.f(plus, anonymousClass4, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((WidgetImagePlaceholderAdapter$removeFilesIfNeeded$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
