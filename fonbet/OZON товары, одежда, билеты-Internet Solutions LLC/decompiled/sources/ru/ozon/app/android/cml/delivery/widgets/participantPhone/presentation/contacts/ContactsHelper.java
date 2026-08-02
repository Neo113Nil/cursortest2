package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts;

import com.google.android.gms.actions.SearchIntents;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsHelper;", "", "<init>", "()V", "", SearchIntents.EXTRA_QUERY, "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "contacts", "", "filterForSearch", "(Ljava/lang/String;Ljava/util/Collection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/Contact;", "sortByName", "(Ljava/util/Collection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContactsHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<Character> cyryllics = e0.f(e0.h((char) 1105), C7714v.Y0(new b(1072, 1103)));

    @NotNull
    private static final Set<Character> latins = C7714v.Y0(new b('a', 'z'));

    @NotNull
    private static final Set<Character> digits = C7714v.Y0(new b('0', '9'));

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsHelper$Companion;", "", "<init>", "()V", "cyryllics", "", "", "getCyryllics", "()Ljava/util/Set;", "latins", "getLatins", "digits", "getDigits", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Character> getCyryllics() {
            return ContactsHelper.cyryllics;
        }

        @NotNull
        public final Set<Character> getDigits() {
            return ContactsHelper.digits;
        }

        @NotNull
        public final Set<Character> getLatins() {
            return ContactsHelper.latins;
        }

        private Companion() {
        }
    }

    public final Object filterForSearch(@NotNull String str, @NotNull Collection<CellDTO> collection, @NotNull d<? super List<CellDTO>> dVar) {
        return C10727i.f(C10720e0.a(), new ContactsHelper$filterForSearch$2(str, collection, null), dVar);
    }

    public final Object sortByName(@NotNull Collection<Contact> collection, @NotNull d<? super List<Contact>> dVar) {
        return C10727i.f(C10720e0.a(), new ContactsHelper$sortByName$2(collection, null), dVar);
    }
}
