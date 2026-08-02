package ih;

import Pj.C3828f;
import Pj.g;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.controls.button.ButtonDTO;

/* renamed from: ih.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7077b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C7076a f66470a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C7076a f66471b;

    static {
        C3828f h11 = g.h();
        ButtonDTO.Preset preset = ButtonDTO.Preset.SIZE_400;
        f66470a = new C7076a(h11, preset);
        f66471b = new C7076a(g.Q(), preset);
    }

    @NotNull
    public static C7076a a() {
        return f66470a;
    }

    @NotNull
    public static C7076a b() {
        return f66471b;
    }
}
