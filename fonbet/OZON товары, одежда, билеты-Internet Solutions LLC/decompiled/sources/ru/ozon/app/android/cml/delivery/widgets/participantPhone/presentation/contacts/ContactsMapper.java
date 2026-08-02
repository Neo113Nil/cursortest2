package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsMapper;", "", "<init>", "()V", "", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/Contact;", "contacts", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "mapToCells", "(Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContactsMapper {
    public final Object mapToCells(@NotNull List<Contact> list, @NotNull CellDTO cellDTO, @NotNull d<? super List<CellDTO>> dVar) {
        return C10727i.f(C10720e0.a(), new ContactsMapper$mapToCells$2(list, cellDTO, null), dVar);
    }
}
