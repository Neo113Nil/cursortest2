package ru.ozon.id.nativeauth.credentials.countryCode;

import Jb0.A;
import Jb0.z;
import Sc.o;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.DisclosureIconTitleSubtitleCellView;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureIconTitleSubtitleCellHolderKt;
import td0.C9861a;
import yd0.C10886a;

/* loaded from: classes3.dex */
public final class a extends RecyclerView.g<RecyclerView.C> {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f97191e = new b();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<AtomAction.Click, Unit> f97192a;

    /* renamed from: b, reason: collision with root package name */
    private final int f97193b;

    /* renamed from: c, reason: collision with root package name */
    private final int f97194c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private Object f97195d;

    /* renamed from: ru.ozon.id.nativeauth.credentials.countryCode.a$a, reason: collision with other inner class name */
    private final class C2130a extends RecyclerView.C {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final DisclosureIconTitleSubtitleCellView f97196a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f97197b;

        /* renamed from: ru.ozon.id.nativeauth.credentials.countryCode.a$a$a, reason: collision with other inner class name */
        /* synthetic */ class C2131a extends C7735q implements Function1<AtomAction, Unit> {
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
                invoke2(atomAction);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AtomAction p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                C2130a c2130a = (C2130a) this.receiver;
                c2130a.getClass();
                if (p02 instanceof AtomAction.Click) {
                    ((ru.ozon.id.nativeauth.credentials.countryCode.b) c2130a.f97197b.f97192a).invoke(p02);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2130a(@NotNull a aVar, DisclosureIconTitleSubtitleCellView view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f97197b = aVar;
            this.f97196a = view;
        }

        public final void e(@NotNull DisclosureIconTitleSubtitleCellDTO data) {
            Intrinsics.checkNotNullParameter(data, "data");
            C2131a c2131a = new C2131a(1, this, C2130a.class, "onAction", "onAction(Lru/ozon/uni/atoms/af/AtomAction;)V", 0);
            DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView = this.f97196a;
            DisclosureIconTitleSubtitleCellHolderKt.bind(disclosureIconTitleSubtitleCellView, data, c2131a);
            a aVar = this.f97197b;
            disclosureIconTitleSubtitleCellView.setPaddingRelative(aVar.f97193b, 0, aVar.f97194c, 0);
            String baseLocator = String.valueOf(getAdapterPosition());
            disclosureIconTitleSubtitleCellView.setContentDescription(baseLocator);
            Intrinsics.checkNotNullParameter(disclosureIconTitleSubtitleCellView, "<this>");
            Intrinsics.checkNotNullParameter(baseLocator, "baseLocator");
            IconTitleSubtitleCellView mainView = disclosureIconTitleSubtitleCellView.getMainView();
            Intrinsics.checkNotNullParameter(mainView, "<this>");
            Intrinsics.checkNotNullParameter(baseLocator, "baseLocator");
            C9861a.b(mainView.getMainView(), baseLocator);
            C9861a.a(mainView.getAddonView(), baseLocator + ".icon");
            C9861a.a(disclosureIconTitleSubtitleCellView.getAddonView(), baseLocator + ".disclosure");
        }
    }

    public static final class b {
    }

    private final class c extends RecyclerView.C {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C10886a f97198a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull A binding) {
            super(binding.a());
            Intrinsics.checkNotNullParameter(binding, "binding");
            z a11 = z.a(binding.a());
            Intrinsics.checkNotNullExpressionValue(a11, "bind(...)");
            this.f97198a = new C10886a(a11, true);
        }

        public final void e() {
            this.f97198a.b(true);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class d {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d Cell;
        public static final d Loader;

        static {
            d dVar = new d("Cell", 0);
            Cell = dVar;
            d dVar2 = new d("Loader", 1);
            Loader = dVar2;
            d[] dVarArr = {dVar, dVar2};
            $VALUES = dVarArr;
            $ENTRIES = Xc.b.a(dVarArr);
        }

        private d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97199a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.Cell.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.Loader.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f97199a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Function1<? super AtomAction.Click, Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f97192a = onClick;
        this.f97193b = UiExtKt.toPx(24);
        this.f97194c = UiExtKt.toPx(16);
        this.f97195d = K.f71697a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        int size = this.f97195d.size();
        if (size < 1) {
            return 1;
        }
        return size;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i11) {
        return (this.f97195d.isEmpty() ? d.Loader : d.Cell).ordinal();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(@NotNull RecyclerView.C holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        int i12 = e.f97199a[d.values()[holder.getItemViewType()].ordinal()];
        if (i12 == 1) {
            ((C2130a) holder).e((DisclosureIconTitleSubtitleCellDTO) this.f97195d.get(i11));
        } else {
            if (i12 != 2) {
                throw new o();
            }
            ((c) holder).e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public final RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i12 = e.f97199a[d.values()[i11].ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                throw new o();
            }
            A b11 = A.b(LayoutInflater.from(parent.getContext()), parent);
            z.a(b11.a()).f14577c.setBackgroundResource(R.color.transparent);
            Intrinsics.checkNotNullExpressionValue(b11, "apply(...)");
            return new c(b11);
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView = new DisclosureIconTitleSubtitleCellView(context, null, 0, 0, null, false, 62, null);
        disclosureIconTitleSubtitleCellView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        disclosureIconTitleSubtitleCellView.setBackgroundResource(ru.ozon.app.android.R.drawable.bg_ozon_id_country_selector_item);
        return new C2130a(this, disclosureIconTitleSubtitleCellView);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setItems(@NotNull List<DisclosureIconTitleSubtitleCellDTO> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f97195d = value;
        notifyDataSetChanged();
    }
}
