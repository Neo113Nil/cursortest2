package ld0;

import Ez.ViewOnClickListenerC2978b;
import Kb0.K;
import Sc.InterfaceC4008j;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.squareup.moshi.Moshi;
import dc0.C6149M;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lld0/D;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: ld0.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7929D extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    private Jb0.j f73190a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f73191b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f73192c;

    /* renamed from: ld0.D$a */
    static final class a extends AbstractC7737t implements Function0<Moshi> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f73193b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Moshi invoke() {
            K k11 = Tb0.a.f26975d;
            if (k11 != null) {
                return k11.M().o().getValue();
            }
            throw new Lb0.a();
        }
    }

    /* renamed from: ld0.D$b */
    static final class b extends AbstractC7737t implements Function0<C6149M> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f73194b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final C6149M invoke() {
            K k11 = Tb0.a.f26975d;
            if (k11 != null) {
                return k11.R().getValue();
            }
            throw new Lb0.a();
        }
    }

    public C7929D() {
        super(R.layout.fragment_ozon_id_debug_notification);
        this.f73191b = Sc.k.b(b.f73194b);
        this.f73192c = Sc.k.b(a.f73193b);
    }

    public static void t(C7929D c7929d, Jb0.j jVar) {
        C6149M c6149m = (C6149M) c7929d.f73191b.getValue();
        FrameLayout ozonIdDebugNotifierContainer = jVar.f14486e;
        Intrinsics.checkNotNullExpressionValue(ozonIdDebugNotifierContainer, "ozonIdDebugNotifierContainer");
        c6149m.e(ozonIdDebugNotifierContainer);
    }

    public static void u(C7929D c7929d) {
        Editable text;
        String obj;
        Jb0.j jVar = c7929d.f73190a;
        if (jVar == null || (text = jVar.f14485d.getText()) == null || (obj = text.toString()) == null) {
            return;
        }
        try {
            NotificationDTO notificationDTO = (NotificationDTO) ((Moshi) c7929d.f73192c.getValue()).c(NotificationDTO.class).fromJson(obj);
            if (notificationDTO == null) {
                Toast.makeText(c7929d.requireContext(), "Failed to parse JSON", 0).show();
            } else {
                ((C6149M) c7929d.f73191b.getValue()).g(notificationDTO, new C7930E(c7929d));
            }
        } catch (Exception e11) {
            Toast.makeText(c7929d.requireContext(), "Invalid JSON: " + e11.getMessage(), 1).show();
        }
    }

    public static void v(C7929D c7929d) {
        ((C6149M) c7929d.f73191b.getValue()).d();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        this.f73190a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Jb0.j a11 = Jb0.j.a(view);
        C6149M c6149m = (C6149M) this.f73191b.getValue();
        FrameLayout ozonIdDebugNotifierContainer = a11.f14486e;
        Intrinsics.checkNotNullExpressionValue(ozonIdDebugNotifierContainer, "ozonIdDebugNotifierContainer");
        c6149m.e(ozonIdDebugNotifierContainer);
        a11.f14485d.setText(((Moshi) this.f73192c.getValue()).c(NotificationDTO.class).toJson(new NotificationDTO("Debug notification", null, 0, null, null, new NotificationDTO.RightContent(NotificationDTO.RightContent.ButtonType.DISCLOSURE, null, null, null, 14, null), null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, "custom_action", null, 10, null), null, null, 6, null), null, NotificationDTO.Preset.INFO, 346, null)));
        a11.f14488g.setOnClickListener(new AU.a(this, 9));
        a11.f14487f.setOnClickListener(new Hx.b(4, this, a11));
        a11.f14483b.setOnClickListener(new ViewOnClickListenerC2978b(this, 14));
        this.f73190a = a11;
    }
}
