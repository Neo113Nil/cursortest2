package expo.modules.contacts.next.domain.model.website.operations;

import android.content.ContentProviderOperation;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.next.domain.model.Insertable;
import expo.modules.contacts.next.domain.model.website.WebsiteLabel;
import expo.modules.contacts.next.domain.model.website.WebsiteModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewWebsite.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/contacts/next/domain/model/website/operations/NewWebsite;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteModel;", "Lexpo/modules/contacts/next/domain/model/Insertable;", "url", "", Constants.ScionAnalytics.PARAM_LABEL, "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;", "<init>", "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;)V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NewWebsite extends WebsiteModel implements Insertable {
    @Override // expo.modules.contacts.next.domain.model.Insertable
    public ContentProviderOperation toInsertOperation() {
        return Insertable.DefaultImpls.toInsertOperation(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewWebsite(String str, WebsiteLabel label) {
        super(str, label);
        Intrinsics.checkNotNullParameter(label, "label");
    }
}
