package expo.modules.contacts.next.domain.model.structuredpostal.operations;

import android.content.ContentProviderOperation;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalLabel;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExistingStructuredPostal.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BI\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;", "Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "street", "", "city", "region", "postcode", "country", Constants.ScionAnalytics.PARAM_LABEL, "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDataId-sXKVoX8", "()Ljava/lang/String;", "Ljava/lang/String;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExistingStructuredPostal extends StructuredPostalModel implements Updatable.Data, Extractable.Data {
    private final String dataId;

    public /* synthetic */ ExistingStructuredPostal(String str, String str2, String str3, String str4, String str5, String str6, StructuredPostalLabel structuredPostalLabel, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, structuredPostalLabel);
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable.Data, expo.modules.contacts.next.domain.model.Updatable
    public ContentProviderOperation toUpdateOperation() {
        return Updatable.Data.DefaultImpls.toUpdateOperation(this);
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable.Data, expo.modules.contacts.next.domain.model.Extractable.Data
    /* renamed from: getDataId-sXKVoX8, reason: from getter */
    public String getDataId() {
        return this.dataId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ExistingStructuredPostal(String dataId, String str, String str2, String str3, String str4, String str5, StructuredPostalLabel label) {
        super(str, str2, str3, str4, str5, label);
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(label, "label");
        this.dataId = dataId;
    }
}
