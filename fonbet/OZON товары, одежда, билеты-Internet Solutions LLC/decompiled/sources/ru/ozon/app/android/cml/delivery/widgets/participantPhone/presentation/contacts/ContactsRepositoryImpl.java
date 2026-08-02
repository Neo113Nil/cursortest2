package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts;

import He.b;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.permission.extension.ActivitiesKt;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsRepositoryImpl;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsRepository;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsHelper;", "contactsHelper", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsHelper;)V", "", "fullName", "generateInitials", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/app/Activity;", "activity", "", "checkPermission", "(Landroid/app/Activity;)Z", "Lkotlin/Function0;", "", "onPermissionGranted", "requestPermission", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/ContentResolver;", "resolver", "", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/Contact;", "fetchContacts", "(Landroid/content/ContentResolver;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsHelper;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContactsRepositoryImpl implements ContactsRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ContactsHelper contactsHelper;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsRepositoryImpl$Companion;", "", "<init>", "()V", "PERMISSION_READ_CONTACTS", "", "NAME_COLUMN_INDEX", "", "PHONE_COLUMN_INDEX", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ContactsRepositoryImpl(@NotNull ContactsHelper contactsHelper) {
        Intrinsics.checkNotNullParameter(contactsHelper, "contactsHelper");
        this.contactsHelper = contactsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r6 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String generateInitials(String fullName) {
        String str;
        Character F11;
        Character F12;
        Character F13;
        List m11 = h.m(fullName, new String[]{" "}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m11) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        String str2 = "";
        if (arrayList.size() == 1) {
            String str3 = (String) C7714v.M(arrayList);
            if (str3 != null && (F13 = h.F(str3)) != null) {
                String valueOf = String.valueOf(F13.charValue());
                Intrinsics.g(valueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                if (upperCase != null) {
                    return upperCase;
                }
            }
        } else if (arrayList.size() >= 2) {
            String str4 = (String) C7714v.M(arrayList);
            if (str4 != null && (F12 = h.F(str4)) != null) {
                String valueOf2 = String.valueOf(F12.charValue());
                Intrinsics.g(valueOf2, "null cannot be cast to non-null type java.lang.String");
                str = valueOf2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
            }
            str = "";
            String str5 = (String) C7714v.Z(arrayList);
            if (str5 != null && (F11 = h.F(str5)) != null) {
                String valueOf3 = String.valueOf(F11.charValue());
                Intrinsics.g(valueOf3, "null cannot be cast to non-null type java.lang.String");
                String upperCase2 = valueOf3.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                if (upperCase2 != null) {
                    str2 = upperCase2;
                }
            }
            return str.concat(str2);
        }
        return "";
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsRepository
    public boolean checkPermission(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return PermissionExtensionsKt.isPermissionGranted(applicationContext, "android.permission.READ_CONTACTS");
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsRepository
    public Object fetchContacts(@NotNull ContentResolver contentResolver, @NotNull d<? super List<Contact>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new ContactsRepositoryImpl$fetchContacts$2(contentResolver, this, null), dVar);
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsRepository
    public void requestPermission(@NotNull Activity activity, @NotNull Function0<Unit> onPermissionGranted) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onPermissionGranted, "onPermissionGranted");
        ActivitiesKt.requestPermission(activity, new ContactsRepositoryImpl$requestPermission$1(onPermissionGranted));
    }
}
