package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts;

import Sc.s;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<anonymous>", "(Lxe/M;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsMapper$mapToCells$2", f = "ContactsMapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ContactsMapper$mapToCells$2 extends j implements Function2<M, d<? super List<? extends CellDTO>>, Object> {
    final /* synthetic */ CellDTO $cell;
    final /* synthetic */ List<Contact> $contacts;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsMapper$mapToCells$2(List<Contact> list, CellDTO cellDTO, d<? super ContactsMapper$mapToCells$2> dVar) {
        super(2, dVar);
        this.$contacts = list;
        this.$cell = cellDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ContactsMapper$mapToCells$2(this.$contacts, this.$cell, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super List<? extends CellDTO>> dVar) {
        return invoke2(m11, (d<? super List<CellDTO>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        IconDTO icon;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        List<Contact> list = this.$contacts;
        CellDTO cellDTO = this.$cell;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (Contact contact : list) {
            CellDTO.CenterBlock centerBlock = cellDTO.getCenterBlock();
            CellDTO.CellText copy$default = CellDTO.CellText.copy$default(cellDTO.getCenterBlock().getTitle(), OzonSpannableStringKt.toOzonSpannableString(contact.getName()), null, null, false, null, null, 62, null);
            CellDTO.CellText subtitle = cellDTO.getCenterBlock().getSubtitle();
            CellDTO.LeftBlock leftBlock = null;
            r4 = null;
            IconDTO iconDTO = null;
            CellDTO.CenterBlock copy$default2 = CellDTO.CenterBlock.copy$default(centerBlock, copy$default, subtitle != null ? CellDTO.CellText.copy$default(subtitle, OzonSpannableStringKt.toOzonSpannableString(contact.getNumber()), null, null, false, null, null, 62, null) : null, null, null, null, null, 60, null);
            CellDTO.LeftBlock leftBlock2 = cellDTO.getLeftBlock();
            if (leftBlock2 != null) {
                CellDTO.LeftBlock leftBlock3 = cellDTO.getLeftBlock();
                if (leftBlock3 != null && (icon = leftBlock3.getIcon()) != null) {
                    iconDTO = icon.copy((r34 & 1) != 0 ? icon.size : null, (r34 & 2) != 0 ? icon.hasShape : null, (r34 & 4) != 0 ? icon.shape : null, (r34 & 8) != 0 ? icon.text : contact.getInitials(), (r34 & 16) != 0 ? icon.icon : null, (r34 & 32) != 0 ? icon.backgroundImage : null, (r34 & 64) != 0 ? icon.backgroundColor : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? icon.textColor : null, (r34 & 256) != 0 ? icon.textStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? icon.borderColor : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? icon.borderWidth : null, (r34 & 2048) != 0 ? icon.isBorderInside : null, (r34 & 4096) != 0 ? icon.hasParanja : null, (r34 & 8192) != 0 ? icon.getContext() : null, (r34 & 16384) != 0 ? icon.getTestInfo() : null, (r34 & 32768) != 0 ? icon.getTrackingInfo() : null);
                }
                leftBlock = CellDTO.LeftBlock.copy$default(leftBlock2, null, null, null, null, null, iconDTO, null, null, 223, null);
            }
            arrayList.add(CellDTO.copy$default(cellDTO, copy$default2, null, leftBlock, null, null, 26, null));
        }
        return arrayList;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super List<CellDTO>> dVar) {
        return ((ContactsMapper$mapToCells$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
