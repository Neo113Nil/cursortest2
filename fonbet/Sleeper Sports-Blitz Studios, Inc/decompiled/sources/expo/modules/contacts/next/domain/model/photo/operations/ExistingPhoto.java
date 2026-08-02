package expo.modules.contacts.next.domain.model.photo.operations;

import android.content.ContentProviderOperation;
import com.facebook.internal.AnalyticsEvents;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.photo.PhotoModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExistingPhoto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;", "Lexpo/modules/contacts/next/domain/model/photo/PhotoModel;", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "", "<init>", "(Ljava/lang/String;[BLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDataId-sXKVoX8", "()Ljava/lang/String;", "Ljava/lang/String;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExistingPhoto extends PhotoModel implements Extractable.Data, Updatable.Data {
    private final String dataId;

    public /* synthetic */ ExistingPhoto(String str, byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr);
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable.Data, expo.modules.contacts.next.domain.model.Updatable
    public ContentProviderOperation toUpdateOperation() {
        return Updatable.Data.DefaultImpls.toUpdateOperation(this);
    }

    @Override // expo.modules.contacts.next.domain.model.Extractable.Data
    /* renamed from: getDataId-sXKVoX8, reason: from getter */
    public String getDataId() {
        return this.dataId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ExistingPhoto(String dataId, byte[] bArr) {
        super(bArr);
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        this.dataId = dataId;
    }
}
