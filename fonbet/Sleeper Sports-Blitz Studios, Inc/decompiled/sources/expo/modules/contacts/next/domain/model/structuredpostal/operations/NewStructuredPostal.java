package expo.modules.contacts.next.domain.model.structuredpostal.operations;

import android.content.ContentProviderOperation;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.next.domain.model.Insertable;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalLabel;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewStructuredPostal.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/NewStructuredPostal;", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;", "Lexpo/modules/contacts/next/domain/model/Insertable;", "street", "", "city", "region", "postcode", "country", Constants.ScionAnalytics.PARAM_LABEL, "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;)V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NewStructuredPostal extends StructuredPostalModel implements Insertable {
    @Override // expo.modules.contacts.next.domain.model.Insertable
    public ContentProviderOperation toInsertOperation() {
        return Insertable.DefaultImpls.toInsertOperation(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewStructuredPostal(String str, String str2, String str3, String str4, String str5, StructuredPostalLabel label) {
        super(str, str2, str3, str4, str5, label);
        Intrinsics.checkNotNullParameter(label, "label");
    }
}
