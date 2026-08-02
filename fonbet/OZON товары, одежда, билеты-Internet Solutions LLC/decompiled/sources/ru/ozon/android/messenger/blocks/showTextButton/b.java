package ru.ozon.android.messenger.blocks.showTextButton;

import Sc.s;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.v;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.showTextButton.ShowHiddenTextViewModel$handleAction$1", f = "ShowHiddenTextViewModel.kt", l = {57, 71}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f86382d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f86383e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f86384f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Map<String, String> f86385g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f86386h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, ru.ozon.android.messenger.framework.navigation.action.a aVar, Map<String, String> map, ru.ozon.android.messenger.framework.core.d dVar, kotlin.coroutines.d<? super b> dVar2) {
        super(2, dVar2);
        this.f86383e = cVar;
        this.f86384f = aVar;
        this.f86385g = map;
        this.f86386h = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f86383e, this.f86384f, this.f86385g, this.f86386h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
    
        if (xe.Y.b(1000, r20) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0033, code lost:
    
        if (r2 == r1) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object C11;
        Object f02;
        String str;
        NotificationLayoutManager asNotificationLayoutManager$default;
        Object f03;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f86382d;
        c cVar = this.f86383e;
        if (i11 == 0) {
            s.b(obj);
            C9351a c9351a = cVar.f86388e;
            if (c9351a == null) {
                Intrinsics.n("actionRepository");
                throw null;
            }
            this.f86382d = 1;
            C11 = c9351a.C(this.f86384f, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            C11 = obj;
        }
        ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) C11;
        if (iVar instanceof i.b) {
            ((i.b) iVar).getClass();
            int i12 = c.f86387g;
            cVar.getClass();
            f03 = cVar.f0();
            v.e0(cVar, k.a((k) f03, false));
        }
        if (iVar instanceof i.a) {
            int i13 = c.f86387g;
            cVar.getClass();
            f02 = cVar.f0();
            v.e0(cVar, k.a((k) f02, false));
            Map<String, String> map = this.f86385g;
            if (map != null && (str = (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.ERROR_TITLE.a(), map)) != null) {
                String str2 = (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.ERROR_SUBTITLE.a(), map);
                ru.ozon.android.messenger.framework.core.d dVar = this.f86386h;
                if (dVar != null && (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(dVar.e(), null, 1, null)) != null) {
                    NotificationBar.Companion companion = NotificationBar.INSTANCE;
                    NotificationDTO notificationDTO = new NotificationDTO(str, str2, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
                    J viewLifecycleOwner = dVar.d().getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    NotificationBar.Companion.make$default(companion, asNotificationLayoutManager$default, notificationDTO, viewLifecycleOwner, null, 8, null).show();
                }
            }
        }
        this.f86382d = 2;
    }
}
