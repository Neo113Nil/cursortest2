package expo.modules.contacts.next.domain.model.structuredname.operations;

import android.content.ContentProviderOperation;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.structuredname.StructuredNameModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExistingStructuredName.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B_\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;", "Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;", "Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "givenName", "", "middleName", "familyName", "prefix", "suffix", "phoneticGivenName", "phoneticMiddleName", "phoneticFamilyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDataId-sXKVoX8", "()Ljava/lang/String;", "Ljava/lang/String;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExistingStructuredName extends StructuredNameModel implements Updatable.Data, Extractable.Data {
    private final String dataId;

    public /* synthetic */ ExistingStructuredName(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9);
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
    private ExistingStructuredName(String dataId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(str, str2, str3, str4, str5, str6, str7, str8);
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        this.dataId = dataId;
    }
}
