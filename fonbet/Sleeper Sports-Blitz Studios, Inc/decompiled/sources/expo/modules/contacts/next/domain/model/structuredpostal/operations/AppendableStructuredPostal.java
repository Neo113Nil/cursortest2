package expo.modules.contacts.next.domain.model.structuredpostal.operations;

import android.content.ContentProviderOperation;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalLabel;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppendableStructuredPostal.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/AppendableStructuredPostal;", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;", "Lexpo/modules/contacts/next/domain/model/Appendable;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "street", "", "city", "region", "postcode", "country", Constants.ScionAnalytics.PARAM_LABEL, "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getRawContactId-WW_a-ig", "()Ljava/lang/String;", "Ljava/lang/String;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AppendableStructuredPostal extends StructuredPostalModel implements Appendable {
    private final String rawContactId;

    public /* synthetic */ AppendableStructuredPostal(String str, String str2, String str3, String str4, String str5, String str6, StructuredPostalLabel structuredPostalLabel, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, structuredPostalLabel);
    }

    @Override // expo.modules.contacts.next.domain.model.Appendable
    public ContentProviderOperation toAppendOperation() {
        return Appendable.DefaultImpls.toAppendOperation(this);
    }

    @Override // expo.modules.contacts.next.domain.model.Appendable
    /* renamed from: getRawContactId-WW_a-ig, reason: from getter */
    public String getRawContactId() {
        return this.rawContactId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AppendableStructuredPostal(String rawContactId, String str, String str2, String str3, String str4, String str5, StructuredPostalLabel label) {
        super(str, str2, str3, str4, str5, label);
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        Intrinsics.checkNotNullParameter(label, "label");
        this.rawContactId = rawContactId;
    }
}
