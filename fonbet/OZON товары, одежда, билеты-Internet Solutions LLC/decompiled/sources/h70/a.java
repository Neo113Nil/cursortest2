package h70;

import G.g;
import Sc.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n70.EnumC8449a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.features.offline.ui.accountcard.AccountCardState;
import ru.ozon.fintech.features.offline.ui.itemcard.IconTextCardState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final FinToolbarState f65061a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f65062b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AccountCardState f65063c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final IconTextCardState f65064d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final IconTextCardState f65065e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<EnumC8449a> f65066f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C1054a f65067g;

    /* renamed from: h70.a$a, reason: collision with other inner class name */
    public static final class C1054a {
        public C1054a() {
            Intrinsics.checkNotNullParameter("Обновить", SelectionItemFormDTO.TITLE_FIELD_NAME);
            Intrinsics.checkNotNullParameter("ic_m_reload_filled", "icon");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1054a)) {
                return false;
            }
            ((C1054a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 874583053;
        }

        @NotNull
        public final String toString() {
            return "ButtonState(title=Обновить, icon=ic_m_reload_filled)";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f65068a;

        /* renamed from: h70.a$b$a, reason: collision with other inner class name */
        public /* synthetic */ class C1055a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f65069a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.NEUTRAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.POSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.WARNING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.NEGATIVE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[c.MARKETING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f65069a = iArr;
            }
        }

        public b(@NotNull c theme) {
            Intrinsics.checkNotNullParameter("Режим без интернета", SelectionItemFormDTO.TITLE_FIELD_NAME);
            Intrinsics.checkNotNullParameter("Подключитесь к сети, чтобы работать \nв полной версии банка", "subtitle");
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter("ic_m_planet_cross_filled", "icon");
            Intrinsics.checkNotNullParameter("Подробнее", "mainButtonTitle");
            this.f65068a = theme;
        }

        @NotNull
        public final DisclaimerDTO a() {
            DisclaimerDTO.Theme theme;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString("Режим без интернета");
            OzonSpannableString ozonSpannableString2 = OzonSpannableStringKt.toOzonSpannableString("Подключитесь к сети, чтобы работать \nв полной версии банка");
            int i11 = C1055a.f65069a[this.f65068a.ordinal()];
            if (i11 == 1) {
                theme = DisclaimerDTO.Theme.NEUTRAL;
            } else if (i11 == 2) {
                theme = DisclaimerDTO.Theme.POSITIVE;
            } else if (i11 == 3) {
                theme = DisclaimerDTO.Theme.WARNING;
            } else if (i11 == 4) {
                theme = DisclaimerDTO.Theme.NEGATIVE;
            } else {
                if (i11 != 5) {
                    throw new o();
                }
                theme = DisclaimerDTO.Theme.MARKETING;
            }
            return new DisclaimerDTO(ozonSpannableString, ozonSpannableString2, theme, null, "ic_m_planet_cross_filled", new DisclaimerDTO.MainButton("Подробнее", DisclaimerDTO.ButtonTheme.BASE, null, null, 12, null), null, null, null, null, false, null, null, 8136, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return this.f65068a == bVar.f65068a;
        }

        public final int hashCode() {
            return ((((this.f65068a.hashCode() + 1641642135) * 31) - 852374191) * 31) - 1991547105;
        }

        @NotNull
        public final String toString() {
            return "OfflineDisclaimerState(title=Режим без интернета, subtitle=Подключитесь к сети, чтобы работать \nв полной версии банка, theme=" + this.f65068a + ", icon=ic_m_planet_cross_filled, mainButtonTitle=Подробнее)";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c MARKETING;
        public static final c NEGATIVE;
        public static final c NEUTRAL;
        public static final c POSITIVE;
        public static final c WARNING;

        static {
            c cVar = new c("NEUTRAL", 0);
            NEUTRAL = cVar;
            c cVar2 = new c("POSITIVE", 1);
            POSITIVE = cVar2;
            c cVar3 = new c("WARNING", 2);
            WARNING = cVar3;
            c cVar4 = new c("NEGATIVE", 3);
            NEGATIVE = cVar4;
            c cVar5 = new c("MARKETING", 4);
            MARKETING = cVar5;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
            $VALUES = cVarArr;
            $ENTRIES = Xc.b.a(cVarArr);
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public a(@NotNull FinToolbarState toolbarState, @NotNull b disclaimerState, @NotNull AccountCardState mainAccountState, @NotNull IconTextCardState sbpCardState, @NotNull IconTextCardState callCenterCardState, @NotNull List cbottomItems, @NotNull C1054a buttonState) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(disclaimerState, "disclaimerState");
        Intrinsics.checkNotNullParameter("Доступно без интернета", SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullParameter(mainAccountState, "mainAccountState");
        Intrinsics.checkNotNullParameter(sbpCardState, "sbpCardState");
        Intrinsics.checkNotNullParameter(callCenterCardState, "callCenterCardState");
        Intrinsics.checkNotNullParameter(cbottomItems, "cbottomItems");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f65061a = toolbarState;
        this.f65062b = disclaimerState;
        this.f65063c = mainAccountState;
        this.f65064d = sbpCardState;
        this.f65065e = callCenterCardState;
        this.f65066f = cbottomItems;
        this.f65067g = buttonState;
    }

    @NotNull
    public final C1054a a() {
        return this.f65067g;
    }

    @NotNull
    public final IconTextCardState b() {
        return this.f65065e;
    }

    @NotNull
    public final b c() {
        return this.f65062b;
    }

    @NotNull
    public final AccountCardState d() {
        return this.f65063c;
    }

    @NotNull
    public final IconTextCardState e() {
        return this.f65064d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f65061a.equals(aVar.f65061a) && this.f65062b.equals(aVar.f65062b) && this.f65063c.equals(aVar.f65063c) && this.f65064d.equals(aVar.f65064d) && this.f65065e.equals(aVar.f65065e) && Intrinsics.d(this.f65066f, aVar.f65066f) && this.f65067g.equals(aVar.f65067g);
    }

    @NotNull
    public final FinToolbarState f() {
        return this.f65061a;
    }

    public final int hashCode() {
        return ((Integer.hashCode(0) + g.b((this.f65065e.hashCode() + ((this.f65064d.hashCode() + ((this.f65063c.hashCode() + ((((this.f65062b.hashCode() + (this.f65061a.hashCode() * 31)) * 31) + 1485986665) * 31)) * 31)) * 31)) * 31, 31, this.f65066f)) * 31) + 874583053;
    }

    @NotNull
    public final String toString() {
        return "OfflineMainState(toolbarState=" + this.f65061a + ", disclaimerState=" + this.f65062b + ", title=Доступно без интернета, mainAccountState=" + this.f65063c + ", sbpCardState=" + this.f65064d + ", callCenterCardState=" + this.f65065e + ", cbottomItems=" + this.f65066f + ", selectedCbottomIndex=0, buttonState=" + this.f65067g + ")";
    }
}
