package ru.ozon.android.messenger.blocks.disclaimer.modal.adapter;

import Sc.o;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c;
import ru.ozon.app.android.messenger.databinding.MDisclaimerModalDescriptionItemBinding;
import ru.ozon.app.android.messenger.databinding.MDisclaimerModalDisclosureItemBinding;

/* loaded from: classes10.dex */
public final class a extends t<c, ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.holder.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<c.a, Unit> f85053a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.a$a, reason: collision with other inner class name */
    private static final class EnumC1491a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC1491a[] $VALUES;
        public static final EnumC1491a Description;
        public static final EnumC1491a Disclosure;
        private final int value;

        static {
            EnumC1491a enumC1491a = new EnumC1491a("Description", 0, 0);
            Description = enumC1491a;
            EnumC1491a enumC1491a2 = new EnumC1491a("Disclosure", 1, 1);
            Disclosure = enumC1491a2;
            EnumC1491a[] enumC1491aArr = {enumC1491a, enumC1491a2};
            $VALUES = enumC1491aArr;
            $ENTRIES = Xc.b.a(enumC1491aArr);
        }

        private EnumC1491a(String str, int i11, int i12) {
            this.value = i12;
        }

        public static EnumC1491a valueOf(String str) {
            return (EnumC1491a) Enum.valueOf(EnumC1491a.class, str);
        }

        public static EnumC1491a[] values() {
            return (EnumC1491a[]) $VALUES.clone();
        }

        public final int a() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Function1<? super c.a, Unit> onDisclosureItemClickListener) {
        super(new b());
        Intrinsics.checkNotNullParameter(onDisclosureItemClickListener, "onDisclosureItemClickListener");
        this.f85053a = onDisclosureItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i11) {
        c cVar = getCurrentList().get(i11);
        if (cVar instanceof c.b) {
            return EnumC1491a.Description.a();
        }
        if (cVar instanceof c.a.C1492a) {
            return EnumC1491a.Disclosure.a();
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.C c11, int i11) {
        ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.holder.a holder = (ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.holder.a) c11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        c cVar = getCurrentList().get(i11);
        Intrinsics.checkNotNullExpressionValue(cVar, "get(...)");
        holder.e(cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.C onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i11 == EnumC1491a.Description.a()) {
            MDisclaimerModalDescriptionItemBinding inflate = MDisclaimerModalDescriptionItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.holder.b(inflate);
        }
        if (i11 == EnumC1491a.Disclosure.a()) {
            MDisclaimerModalDisclosureItemBinding inflate2 = MDisclaimerModalDisclosureItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            return new ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.holder.c(inflate2, this.f85053a);
        }
        throw new IllegalArgumentException("Unknown ViewType: " + i11 + " for " + a.class.getSimpleName());
    }
}
