package ru.ozon.app.android.product.addToCart.presentation;

import A00.a;
import Je.InterfaceC3394a;
import Je.e;
import Sc.s;
import T00.j;
import T00.m;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j10.InterfaceC7238a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.fresh.common.widgets.RecShelfDTO;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0018\u001a\u00020\u00172\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/RecommendationViewController;", "", "<init>", "()V", "Lru/ozon/composer/ui/widget/l;", "clickedItem", "Ll10/i;", "container", "findLastInLine", "(Lru/ozon/composer/ui/widget/l;Ll10/i;)Lru/ozon/composer/ui/widget/l;", "", "position", "", "isComposerHaveWidget", "(ILl10/i;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "actionDTO", "LT00/j;", "generateRawWidget", "(Lru/ozon/uni/atoms/data/AtomActionDTO;I)LT00/j;", "", "tileWidgetId", "atomActionDTO", "", "addRecShelfToProductCard", "(Ljava/lang/Long;Lru/ozon/uni/atoms/data/AtomActionDTO;Ll10/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LJe/a;", "mutex", "LJe/a;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RecommendationViewController {

    @NotNull
    public static final RecommendationViewController INSTANCE = new RecommendationViewController();

    @NotNull
    private static final InterfaceC3394a mutex = e.a();

    private RecommendationViewController() {
    }

    private final l findLastInLine(l clickedItem, i container) {
        View findViewByPosition;
        List<l> b11 = container.J().p().b();
        if (b11 != null) {
            int indexOf = b11.indexOf(clickedItem) + 1;
            RecyclerView.o layoutManager = container.e0().getLayoutManager();
            if (layoutManager != null && (findViewByPosition = layoutManager.findViewByPosition(indexOf)) != null) {
                float y11 = findViewByPosition.getY();
                boolean z11 = false;
                float f7 = y11;
                while (y11 == f7 && !z11) {
                    int i11 = indexOf + 1;
                    View findViewByPosition2 = layoutManager.findViewByPosition(i11);
                    if (findViewByPosition2 instanceof IslandSeparatorView) {
                        z11 = true;
                    }
                    float y12 = findViewByPosition2 != null ? findViewByPosition2.getY() : 0.0f;
                    if (y11 == y12 && !z11) {
                        indexOf = i11;
                    }
                    f7 = y12;
                }
                List<l> b12 = container.J().p().b();
                if (b12 != null) {
                    return b12.get(indexOf - 1);
                }
            }
        }
        return null;
    }

    private final j generateRawWidget(AtomActionDTO actionDTO, int position) {
        String generateWidgetStateId;
        generateWidgetStateId = RecommendationViewControllerKt.generateWidgetStateId(position);
        return new j(new m(1L, "express", "recommendationsShelf", generateWidgetStateId), new RecShelfDTO(actionDTO), U.c(), U.c());
    }

    private final boolean isComposerHaveWidget(int position, i container) {
        String generateWidgetStateId;
        generateWidgetStateId = RecommendationViewControllerKt.generateWidgetStateId(position);
        List<l> b11 = container.J().p().b();
        if (b11 != null) {
            List<l> list = b11;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.d(((l) it.next()).c().d(), generateWidgetStateId)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0132, code lost:
    
        if (xe.Y.b(50, r0) == r1) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addRecShelfToProductCard(Long l11, AtomActionDTO atomActionDTO, i iVar, @NotNull d<? super Unit> dVar) {
        RecommendationViewController$addRecShelfToProductCard$1 recommendationViewController$addRecShelfToProductCard$1;
        int i11;
        Long l12;
        InterfaceC3394a interfaceC3394a;
        Object obj;
        try {
            if (dVar instanceof RecommendationViewController$addRecShelfToProductCard$1) {
                recommendationViewController$addRecShelfToProductCard$1 = (RecommendationViewController$addRecShelfToProductCard$1) dVar;
                int i12 = recommendationViewController$addRecShelfToProductCard$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    recommendationViewController$addRecShelfToProductCard$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = recommendationViewController$addRecShelfToProductCard$1.result;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = recommendationViewController$addRecShelfToProductCard$1.label;
                    if (i11 != 0) {
                        s.b(obj2);
                        InterfaceC3394a interfaceC3394a2 = mutex;
                        recommendationViewController$addRecShelfToProductCard$1.L$0 = l11;
                        recommendationViewController$addRecShelfToProductCard$1.L$1 = atomActionDTO;
                        recommendationViewController$addRecShelfToProductCard$1.L$2 = iVar;
                        recommendationViewController$addRecShelfToProductCard$1.L$3 = interfaceC3394a2;
                        recommendationViewController$addRecShelfToProductCard$1.label = 1;
                        if (interfaceC3394a2.a(recommendationViewController$addRecShelfToProductCard$1) != aVar) {
                            l12 = l11;
                            interfaceC3394a = interfaceC3394a2;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3394a = (InterfaceC3394a) recommendationViewController$addRecShelfToProductCard$1.L$0;
                        s.b(obj2);
                        Unit unit = Unit.f71690a;
                        interfaceC3394a.c(null);
                        return unit;
                    }
                    interfaceC3394a = (InterfaceC3394a) recommendationViewController$addRecShelfToProductCard$1.L$3;
                    iVar = (i) recommendationViewController$addRecShelfToProductCard$1.L$2;
                    atomActionDTO = (AtomActionDTO) recommendationViewController$addRecShelfToProductCard$1.L$1;
                    l12 = (Long) recommendationViewController$addRecShelfToProductCard$1.L$0;
                    s.b(obj2);
                    if (iVar != null || atomActionDTO == null) {
                        Unit unit2 = Unit.f71690a;
                        interfaceC3394a.c(null);
                        return unit2;
                    }
                    List<l> b11 = iVar.J().p().b();
                    if (b11 != null) {
                        Iterator<T> it = b11.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            long f7 = ((l) obj).f();
                            if (l12 != null && f7 == l12.longValue()) {
                                break;
                            }
                        }
                        l lVar = (l) obj;
                        if (lVar != null) {
                            l findLastInLine = INSTANCE.findLastInLine(lVar, iVar);
                            List<l> b12 = iVar.J().p().b();
                            if (b12 == null) {
                                Unit unit3 = Unit.f71690a;
                                interfaceC3394a.c(null);
                                return unit3;
                            }
                            Iterator<l> it2 = b12.iterator();
                            int i13 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    i13 = -1;
                                    break;
                                }
                                l next = it2.next();
                                if (findLastInLine != null && next.f() == findLastInLine.f()) {
                                    break;
                                }
                                i13++;
                            }
                            RecommendationViewController recommendationViewController = INSTANCE;
                            if (recommendationViewController.isComposerHaveWidget(i13, iVar)) {
                                Unit unit4 = Unit.f71690a;
                                interfaceC3394a.c(null);
                                return unit4;
                            }
                            l lVar2 = (l) iVar.J().s().b(recommendationViewController.generateRawWidget(atomActionDTO, i13));
                            InterfaceC7238a<l> r11 = iVar.J().r();
                            a.C2371l.C0009a c0009a = new a.C2371l.C0009a();
                            c0009a.d(lVar2);
                            c0009a.a(findLastInLine != null ? findLastInLine.f() : 0L);
                            r11.c(c0009a.c());
                            recommendationViewController$addRecShelfToProductCard$1.L$0 = interfaceC3394a;
                            recommendationViewController$addRecShelfToProductCard$1.L$1 = null;
                            recommendationViewController$addRecShelfToProductCard$1.L$2 = null;
                            recommendationViewController$addRecShelfToProductCard$1.L$3 = null;
                            recommendationViewController$addRecShelfToProductCard$1.label = 2;
                        }
                    }
                    Unit unit5 = Unit.f71690a;
                    interfaceC3394a.c(null);
                    return unit5;
                }
            }
            if (i11 != 0) {
            }
            if (iVar != null) {
            }
            Unit unit22 = Unit.f71690a;
            interfaceC3394a.c(null);
            return unit22;
        } catch (Throwable th2) {
            l11.c(null);
            throw th2;
        }
        recommendationViewController$addRecShelfToProductCard$1 = new RecommendationViewController$addRecShelfToProductCard$1(this, dVar);
        Object obj22 = recommendationViewController$addRecShelfToProductCard$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = recommendationViewController$addRecShelfToProductCard$1.label;
    }
}
