package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts;

import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsHelper;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<anonymous>", "(Lxe/M;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsHelper$filterForSearch$2", f = "ContactsHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ContactsHelper$filterForSearch$2 extends j implements Function2<M, d<? super List<? extends CellDTO>>, Object> {
    final /* synthetic */ Collection<CellDTO> $contacts;
    final /* synthetic */ String $query;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsHelper$filterForSearch$2(String str, Collection<CellDTO> collection, d<? super ContactsHelper$filterForSearch$2> dVar) {
        super(2, dVar);
        this.$query = str;
        this.$contacts = collection;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ContactsHelper$filterForSearch$2(this.$query, this.$contacts, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super List<? extends CellDTO>> dVar) {
        return invoke2(m11, (d<? super List<CellDTO>>) dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i11;
        StringBuilder sb2;
        boolean z11;
        OzonSpannableString text;
        ContactsHelper.Companion companion;
        ContactsHelper.Companion companion2;
        ContactsHelper.Companion companion3;
        ContactsHelper.Companion companion4;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String str = this.$query;
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = str.charAt(i12);
            companion4 = ContactsHelper.Companion;
            if (companion4.getDigits().contains(new Character(charAt))) {
                sb3.append(charAt);
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        if (sb4.length() <= 0) {
            sb4 = null;
        }
        String str2 = this.$query;
        StringBuilder sb5 = new StringBuilder();
        int length2 = str2.length();
        while (i11 < length2) {
            char charAt2 = str2.charAt(i11);
            companion2 = ContactsHelper.Companion;
            char c11 = charAt2;
            if (!companion2.getCyryllics().contains(new Character(c11))) {
                companion3 = ContactsHelper.Companion;
                i11 = companion3.getLatins().contains(new Character(c11)) ? 0 : i11 + 1;
            }
            sb5.append(charAt2);
        }
        String sb6 = sb5.toString();
        Intrinsics.checkNotNullExpressionValue(sb6, "toString(...)");
        if (sb6.length() <= 0) {
            sb6 = null;
        }
        if (sb4 == null && sb6 == null) {
            return C7714v.U0(this.$contacts);
        }
        Collection<CellDTO> collection = this.$contacts;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collection) {
            CellDTO cellDTO = (CellDTO) obj2;
            OzonSpannableString text2 = cellDTO.getCenterBlock().getTitle().getText();
            CellDTO.CellText subtitle = cellDTO.getCenterBlock().getSubtitle();
            if (subtitle == null || (text = subtitle.getText()) == null) {
                sb2 = null;
            } else {
                sb2 = new StringBuilder();
                int length3 = text.length();
                for (int i13 = 0; i13 < length3; i13++) {
                    char charAt3 = text.charAt(i13);
                    companion = ContactsHelper.Companion;
                    if (companion.getDigits().contains(new Character(charAt3))) {
                        sb2.append(charAt3);
                    }
                }
            }
            if (sb6 == null || !h.t(text2, sb6, true)) {
                if (!(sb4 != null ? Intrinsics.d(sb2 != null ? Boolean.valueOf(h.t(sb2, sb4, false)) : null, Boolean.TRUE) : false)) {
                    z11 = false;
                    if (!z11) {
                        arrayList.add(obj2);
                    }
                }
            }
            z11 = true;
            if (!z11) {
            }
        }
        return arrayList;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super List<CellDTO>> dVar) {
        return ((ContactsHelper$filterForSearch$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
