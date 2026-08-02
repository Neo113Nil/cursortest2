package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts;

import Cw.ViewOnClickListenerC2787a;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ItemContactView;", "view", "Lkotlin/Function1;", "", "", "onClick", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ItemContactView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "contact", "bind", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ItemContactView;", "Lkotlin/jvm/functions/Function1;", "phone", "Ljava/lang/String;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContactItemViewHolder extends j {

    @NotNull
    private final Function1<String, Unit> onClick;
    private String phone;

    @NotNull
    private final ItemContactView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContactItemViewHolder(@NotNull ItemContactView view, @NotNull Function1<? super String, Unit> onClick) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.view = view;
        this.onClick = onClick;
        view.setOnClickListener(new ViewOnClickListenerC2787a(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ContactItemViewHolder contactItemViewHolder, View view) {
        String str = contactItemViewHolder.phone;
        if (str != null) {
            contactItemViewHolder.onClick.invoke(str);
        }
    }

    public final void bind(@NotNull CellDTO contact) {
        OzonSpannableString text;
        Intrinsics.checkNotNullParameter(contact, "contact");
        CellDTO.CellText subtitle = contact.getCenterBlock().getSubtitle();
        this.phone = (subtitle == null || (text = subtitle.getText()) == null) ? null : text.toString();
        CellHolderKt.bindOrGone$default(this.view.getCellView(), contact, null, 2, null);
    }
}
