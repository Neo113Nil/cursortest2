package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts;

import android.app.Activity;
import android.content.ContentResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsRepository;", "", "Landroid/app/Activity;", "activity", "", "checkPermission", "(Landroid/app/Activity;)Z", "Lkotlin/Function0;", "", "onPermissionGranted", "requestPermission", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/ContentResolver;", "resolver", "", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/Contact;", "fetchContacts", "(Landroid/content/ContentResolver;Lkotlin/coroutines/d;)Ljava/lang/Object;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ContactsRepository {
    boolean checkPermission(@NotNull Activity activity);

    Object fetchContacts(@NotNull ContentResolver contentResolver, @NotNull d<? super List<Contact>> dVar);

    void requestPermission(@NotNull Activity activity, @NotNull Function0<Unit> onPermissionGranted);
}
