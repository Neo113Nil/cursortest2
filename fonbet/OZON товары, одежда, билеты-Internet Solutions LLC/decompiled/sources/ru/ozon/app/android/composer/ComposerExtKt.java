package ru.ozon.app.android.composer;

import Tg.b;
import Wg.d;
import a00.C4911f;
import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import i10.h;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import qZ.C9011c;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import xZ.InterfaceC10682a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aA\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001c\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a5\u0010!\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010#\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010%\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b%\u0010$\u001a\u0011\u0010'\u001a\u00020&*\u00020\u0000¢\u0006\u0004\b'\u0010(\u001a\u0019\u0010*\u001a\u00020\u0003*\u00020\u00002\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+\u001a\u0019\u0010*\u001a\u00020\u0003*\u00020\u00002\u0006\u0010,\u001a\u00020\u0007¢\u0006\u0004\b*\u0010-\u001a=\u00100\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0004\b0\u00101\u001a=\u00102\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0004\b2\u00101\u001a1\u00103\u001a\u00020\u0003*\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001H\u0002¢\u0006\u0004\b3\u00104\u001a\u0015\u00106\u001a\u0004\u0018\u000105*\u00020\u0000H\u0002¢\u0006\u0004\b6\u00107\u001a\u0015\u00108\u001a\u0004\u0018\u00010\u0016*\u00020\u0000H\u0002¢\u0006\u0004\b8\u00109\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020:2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010;¨\u0006<"}, d2 = {"La00/f;", "Lkotlin/Function1;", "", "", "block", "withPageTag", "(La00/f;Lkotlin/jvm/functions/Function1;)V", "", "requestCode", "Landroid/content/Intent;", "fillExtrasBlock", "sendResultToTargetFragment", "(La00/f;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "refreshUrl", "Li10/h$b;", "oneTimePostProcessing", "LTg/a;", "actionNavigator", "LTg/b$f;", "scrollTo", "sendRefreshToTargetFragment", "(La00/f;Ljava/lang/String;Li10/h$b;LTg/a;LTg/b$f;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "fragment", "getOneTimePostProcessing", "(LTg/a;LTg/b$f;Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;)Li10/h$b;", "LWg/d;", "converter", "withScrollPositionConverter", "(LTg/a;LWg/d;)LTg/a;", "", "", "postParameters", "sendRefreshToTargetFragmentByPost", "(La00/f;Ljava/lang/String;Ljava/util/Map;)V", "closeFlow", "(La00/f;)V", "closeNonHostActivity", "", "isFlow", "(La00/f;)Z", "link", "scrollTargetFragment", "(La00/f;Ljava/lang/String;)V", "widgetKey", "(La00/f;I)V", "intent", "resultCode", "setResult", "(La00/f;Landroid/content/Intent;ILkotlin/jvm/functions/Function1;)V", "setResultWithTargetRequestCode", "sendRefreshResult", "(La00/f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "LqZ/c;", "currentFlowScreen", "(La00/f;)LqZ/c;", "getScrollTargetFragment", "(La00/f;)Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "Ll10/i;", "(Ll10/i;Lkotlin/jvm/functions/Function1;)V", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposerExtKt {
    public static final void closeFlow(@NotNull C4911f c4911f) {
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        C9011c currentFlowScreen = currentFlowScreen(c4911f);
        if (currentFlowScreen != null) {
            currentFlowScreen.close();
        } else {
            closeNonHostActivity(c4911f);
        }
    }

    public static final void closeNonHostActivity(@NotNull C4911f c4911f) {
        r a11;
        r a12;
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        if ((c4911f.a() instanceof InterfaceC10682a) || (a11 = c4911f.a()) == null || a11.isTaskRoot() || (a12 = c4911f.a()) == null) {
            return;
        }
        a12.finish();
    }

    private static final C9011c currentFlowScreen(C4911f c4911f) {
        ComponentCallbacksC5392m j11 = c4911f.j();
        if (j11 instanceof C9011c) {
            return (C9011c) j11;
        }
        for (ComponentCallbacksC5392m parentFragment = j11.getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof C9011c) {
                return (C9011c) parentFragment;
            }
        }
        return null;
    }

    private static final h.b getOneTimePostProcessing(Tg.a aVar, b.f fVar, ComposerFragment composerFragment) {
        if (aVar == null || fVar == null) {
            return null;
        }
        int i11 = d.f33849e;
        return withScrollPositionConverter(aVar, d.b.a(new ComposerExtKt$getOneTimePostProcessing$1(composerFragment))).get$converter().b(fVar);
    }

    private static final ComposerFragment getScrollTargetFragment(C4911f c4911f) {
        ComponentCallbacksC5392m parentFragment = c4911f.j().getParentFragment();
        if (parentFragment instanceof BottomSheetComposerFragment) {
            ComponentCallbacksC5392m targetFragment = ((BottomSheetComposerFragment) parentFragment).getTargetFragment();
            if (targetFragment instanceof ComposerFragment) {
                return (ComposerFragment) targetFragment;
            }
        }
        return null;
    }

    public static final boolean isFlow(@NotNull C4911f c4911f) {
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        return currentFlowScreen(c4911f) != null;
    }

    public static final void scrollTargetFragment(@NotNull C4911f c4911f, @NotNull String link) {
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        Intrinsics.checkNotNullParameter(link, "link");
        ComposerFragment scrollTargetFragment = getScrollTargetFragment(c4911f);
        if (scrollTargetFragment != null) {
            ComposerFragment.scrollToWidget$default(scrollTargetFragment, link, false, 0, 6, null);
        }
    }

    private static final void sendRefreshResult(C4911f c4911f, String str, Function1<? super Intent, Unit> function1) {
        ComponentCallbacksC5392m targetFragment;
        ComponentCallbacksC5392m c11 = c4911f.c();
        if (c11 == null || (targetFragment = c11.getParentFragment()) == null) {
            ComponentCallbacksC5392m c12 = c4911f.c();
            targetFragment = c12 != null ? c12.getTargetFragment() : null;
            if (targetFragment == null) {
                return;
            }
        }
        Intent intent = new Intent();
        if (str != null) {
            intent.putExtra("EXTRA_REFRESH_URL", str);
        }
        function1.invoke(intent);
        targetFragment.onActivityResult(9001, -1, intent);
    }

    public static final void sendRefreshToTargetFragment(@NotNull C4911f c4911f, String str, h.b bVar, Tg.a aVar, b.f fVar) {
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        ComponentCallbacksC5392m c11 = c4911f.c();
        h.b bVar2 = null;
        ComponentCallbacksC5392m parentFragment = c11 != null ? c11.getParentFragment() : null;
        if ((parentFragment instanceof BottomSheetComposerFragment) && str != null) {
            ComponentCallbacksC5392m targetFragment = ((BottomSheetComposerFragment) parentFragment).getTargetFragment();
            if (targetFragment instanceof ComposerFragment) {
                ComposerFragment composerFragment = (ComposerFragment) targetFragment;
                l.a loader = composerFragment.getConfig().getAppearanceConfig().getLoader();
                if (bVar == null) {
                    bVar = getOneTimePostProcessing(aVar, fVar, composerFragment);
                }
                if (loader != null) {
                    bVar2 = new h.b(bVar != null ? bVar.b() : null, loader);
                }
                composerFragment.startLoading(str, bVar2);
                return;
            }
        }
        sendRefreshResult(c4911f, str, new ComposerExtKt$sendRefreshToTargetFragment$1(bVar));
    }

    public static /* synthetic */ void sendRefreshToTargetFragment$default(C4911f c4911f, String str, h.b bVar, Tg.a aVar, b.f fVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            bVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        if ((i11 & 8) != 0) {
            fVar = null;
        }
        sendRefreshToTargetFragment(c4911f, str, bVar, aVar, fVar);
    }

    public static final void sendRefreshToTargetFragmentByPost(@NotNull C4911f c4911f, String str, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        sendRefreshResult(c4911f, str, new ComposerExtKt$sendRefreshToTargetFragmentByPost$1(map));
    }

    public static final void sendResultToTargetFragment(@NotNull C4911f c4911f, Integer num, @NotNull Function1<? super Intent, Unit> fillExtrasBlock) {
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        Intrinsics.checkNotNullParameter(fillExtrasBlock, "fillExtrasBlock");
        ComponentCallbacksC5392m c11 = c4911f.c();
        if (c11 == null) {
            return;
        }
        ComponentCallbacksC5392m targetFragment = c11.getTargetFragment();
        if (targetFragment == null && (targetFragment = c11.getParentFragment()) == null) {
            return;
        }
        int intValue = num != null ? num.intValue() : c11.getTargetRequestCode();
        Intent intent = new Intent();
        fillExtrasBlock.invoke(intent);
        targetFragment.onActivityResult(intValue, -1, intent);
    }

    public static /* synthetic */ void sendResultToTargetFragment$default(C4911f c4911f, Integer num, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        sendResultToTargetFragment(c4911f, num, function1);
    }

    public static final void setResult(@NotNull C4911f c4911f, @NotNull Intent intent, int i11, Function1<? super Intent, Unit> function1) {
        r a11;
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        ComponentCallbacksC5392m c11 = c4911f.c();
        if (c11 == null) {
            return;
        }
        ComponentCallbacksC5392m targetFragment = c11.getTargetFragment();
        if (targetFragment == null) {
            targetFragment = c11.getParentFragment();
        }
        int targetRequestCode = targetFragment != null ? targetFragment.getTargetRequestCode() : c11.getTargetRequestCode();
        if (function1 != null) {
            function1.invoke(intent);
        }
        if (targetFragment != null) {
            targetFragment.onActivityResult(targetRequestCode, i11, intent);
            return;
        }
        r a12 = c4911f.a();
        if (a12 == null || a12.isTaskRoot() || (a11 = c4911f.a()) == null) {
            return;
        }
        a11.setResult(i11, intent);
    }

    public static /* synthetic */ void setResult$default(C4911f c4911f, Intent intent, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            intent = new Intent();
        }
        if ((i12 & 2) != 0) {
            i11 = -1;
        }
        if ((i12 & 4) != 0) {
            function1 = null;
        }
        setResult(c4911f, intent, i11, function1);
    }

    public static final void setResultWithTargetRequestCode(@NotNull C4911f c4911f, @NotNull Intent intent, int i11, Function1<? super Intent, Unit> function1) {
        r a11;
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        ComponentCallbacksC5392m c11 = c4911f.c();
        if (c11 == null) {
            return;
        }
        ComponentCallbacksC5392m targetFragment = c11.getTargetFragment();
        if (targetFragment == null) {
            targetFragment = c11.getParentFragment();
        }
        int targetRequestCode = c11.getTargetRequestCode();
        if (function1 != null) {
            function1.invoke(intent);
        }
        if (targetFragment != null) {
            targetFragment.onActivityResult(targetRequestCode, i11, intent);
            return;
        }
        r a12 = c4911f.a();
        if (a12 == null || a12.isTaskRoot() || (a11 = c4911f.a()) == null) {
            return;
        }
        a11.setResult(i11, intent);
    }

    public static /* synthetic */ void setResultWithTargetRequestCode$default(C4911f c4911f, Intent intent, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            intent = new Intent();
        }
        if ((i12 & 2) != 0) {
            i11 = -1;
        }
        if ((i12 & 4) != 0) {
            function1 = null;
        }
        setResultWithTargetRequestCode(c4911f, intent, i11, function1);
    }

    public static final void withPageTag(@NotNull C4911f c4911f, @NotNull Function1<? super String, Unit> block) {
        String tag;
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ComponentCallbacksC5392m c11 = c4911f.c();
        if (c11 == null || (tag = c11.getTag()) == null) {
            return;
        }
        block.invoke(tag);
    }

    @NotNull
    public static final Tg.a withScrollPositionConverter(@NotNull final Tg.a aVar, @NotNull final d converter) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new Tg.a() { // from class: ru.ozon.app.android.composer.ComposerExtKt$withScrollPositionConverter$1
            @Override // Tg.a
            public void dismiss() {
                aVar.dismiss();
            }

            @Override // Tg.a
            public QZ.a<? extends C7854a> getComposer() {
                return aVar.getComposer();
            }

            @Override // Tg.a
            /* renamed from: getScrollPositionConverter, reason: from getter */
            public d get$converter() {
                return converter;
            }

            @Override // Tg.a
            public void navigateTo(String link) {
                aVar.navigateTo(link);
            }
        };
    }

    public static final void scrollTargetFragment(@NotNull C4911f c4911f, int i11) {
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        ComposerFragment scrollTargetFragment = getScrollTargetFragment(c4911f);
        if (scrollTargetFragment != null) {
            ComposerFragment.scrollToWidgetKey$default(scrollTargetFragment, i11, 0, false, 6, null);
        }
    }

    public static final void withPageTag(@NotNull i iVar, @NotNull Function1<? super String, Unit> block) {
        String tag;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ComponentCallbacksC5392m b11 = iVar.K().b();
        if (b11 == null || (tag = b11.getTag()) == null) {
            return;
        }
        block.invoke(tag);
    }
}
