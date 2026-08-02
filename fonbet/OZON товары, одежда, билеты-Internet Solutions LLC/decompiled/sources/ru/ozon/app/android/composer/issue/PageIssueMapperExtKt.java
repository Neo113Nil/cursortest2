package ru.ozon.app.android.composer.issue;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import z00.f;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz00/f;", "", "isTestUser", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "asScreenState", "(Lz00/f;Z)Lru/ozon/app/android/uikit/screenstate/ScreenState;", "Lz00/f$c$a$b;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget;", "asScreenStateInvalidWidget", "(Lz00/f$c$a$b;)Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue$ComposerInfo$InvalidWidget;", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PageIssueMapperExtKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f.c.a.b.C2315a.EnumC2317b.values().length];
            try {
                iArr[f.c.a.b.C2315a.EnumC2317b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.c.a.b.C2315a.EnumC2317b.PARSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ScreenState asScreenState(@NotNull f fVar, boolean z11) {
        ScreenState.ServerIssue.ComposerInfo composerInfo;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof f.b) {
            return new ScreenState.NoScreen();
        }
        if (fVar instanceof f.a) {
            return new ScreenState.NoConnection();
        }
        if (!(fVar instanceof f.c)) {
            return null;
        }
        f.c cVar = (f.c) fVar;
        String c11 = cVar.c();
        boolean d11 = cVar.d();
        f.c.a a11 = cVar.a();
        if (a11 != null) {
            Integer b11 = a11.b();
            Integer b12 = a11.b();
            String c12 = a11.c();
            List<f.c.a.b> a12 = a11.a();
            ArrayList arrayList = new ArrayList(C7714v.z(a12, 10));
            Iterator<T> it = a12.iterator();
            while (it.hasNext()) {
                arrayList.add(asScreenStateInvalidWidget((f.c.a.b) it.next()));
            }
            composerInfo = new ScreenState.ServerIssue.ComposerInfo(b11, b12, c12, arrayList);
        } else {
            composerInfo = null;
        }
        return new ScreenState.ServerIssue(c11, d11, z11, composerInfo, null, null, 48, null);
    }

    public static /* synthetic */ ScreenState asScreenState$default(f fVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return asScreenState(fVar, z11);
    }

    private static final ScreenState.ServerIssue.ComposerInfo.InvalidWidget asScreenStateInvalidWidget(f.c.a.b bVar) {
        ScreenState.ServerIssue.ComposerInfo.InvalidWidget.PrepareWidget.Step step;
        if (!(bVar instanceof f.c.a.b.C2315a)) {
            if (!(bVar instanceof f.c.a.b.C2318b)) {
                throw new o();
            }
            f.c.a.b.C2318b c2318b = (f.c.a.b.C2318b) bVar;
            return new ScreenState.ServerIssue.ComposerInfo.InvalidWidget.UnSupportedWidget(c2318b.a(), c2318b.b());
        }
        f.c.a.b.C2315a c2315a = (f.c.a.b.C2315a) bVar;
        String c11 = c2315a.c();
        int i11 = WhenMappings.$EnumSwitchMapping$0[c2315a.a().ordinal()];
        if (i11 == 1) {
            step = ScreenState.ServerIssue.ComposerInfo.InvalidWidget.PrepareWidget.Step.MAP;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            step = ScreenState.ServerIssue.ComposerInfo.InvalidWidget.PrepareWidget.Step.PARSE;
        }
        return new ScreenState.ServerIssue.ComposerInfo.InvalidWidget.PrepareWidget(c11, step, c2315a.b());
    }
}
