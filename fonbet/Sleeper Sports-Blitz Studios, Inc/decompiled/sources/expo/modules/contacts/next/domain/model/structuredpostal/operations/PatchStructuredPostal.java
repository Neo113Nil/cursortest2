package expo.modules.contacts.next.domain.model.structuredpostal.operations;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalLabel;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalModel;
import expo.modules.kotlin.types.ValueOrUndefined;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PatchStructuredPostal.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002By\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/PatchStructuredPostal;", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;", "Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "street", "Lexpo/modules/kotlin/types/ValueOrUndefined;", "", "city", "region", "postcode", "country", Constants.ScionAnalytics.PARAM_LABEL, "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDataId-sXKVoX8", "()Ljava/lang/String;", "Ljava/lang/String;", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PatchStructuredPostal extends StructuredPostalModel implements Updatable.Data {
    private final ContentValues contentValues;
    private final String dataId;

    public /* synthetic */ PatchStructuredPostal(String str, ValueOrUndefined valueOrUndefined, ValueOrUndefined valueOrUndefined2, ValueOrUndefined valueOrUndefined3, ValueOrUndefined valueOrUndefined4, ValueOrUndefined valueOrUndefined5, ValueOrUndefined valueOrUndefined6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, valueOrUndefined, valueOrUndefined2, valueOrUndefined3, valueOrUndefined4, valueOrUndefined5, valueOrUndefined6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PatchStructuredPostal(String str, ValueOrUndefined valueOrUndefined, ValueOrUndefined valueOrUndefined2, ValueOrUndefined valueOrUndefined3, ValueOrUndefined valueOrUndefined4, ValueOrUndefined valueOrUndefined5, ValueOrUndefined valueOrUndefined6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r4, r5, r6, r7, r8, r9, null);
        ValueOrUndefined valueOrUndefined7;
        ValueOrUndefined valueOrUndefined8;
        ValueOrUndefined valueOrUndefined9;
        if ((i & 2) != 0) {
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined = undefined;
        }
        ValueOrUndefined valueOrUndefined10 = valueOrUndefined;
        if ((i & 4) != 0) {
            ValueOrUndefined.Companion companion2 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined2 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined2, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined2 = undefined2;
        }
        ValueOrUndefined valueOrUndefined11 = valueOrUndefined2;
        if ((i & 8) != 0) {
            ValueOrUndefined.Companion companion3 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined3 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined3, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined3 = undefined3;
        }
        ValueOrUndefined valueOrUndefined12 = valueOrUndefined3;
        if ((i & 16) != 0) {
            ValueOrUndefined.Companion companion4 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined4 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined4, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined7 = undefined4;
        } else {
            valueOrUndefined7 = valueOrUndefined4;
        }
        if ((i & 32) != 0) {
            ValueOrUndefined.Companion companion5 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined5 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined5, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined8 = undefined5;
        } else {
            valueOrUndefined8 = valueOrUndefined5;
        }
        if ((i & 64) != 0) {
            ValueOrUndefined.Companion companion6 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined6 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined6, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined9 = undefined6;
        } else {
            valueOrUndefined9 = valueOrUndefined6;
        }
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private PatchStructuredPostal(String dataId, ValueOrUndefined<String> street, ValueOrUndefined<String> city, ValueOrUndefined<String> region, ValueOrUndefined<String> postcode, ValueOrUndefined<String> country, ValueOrUndefined<StructuredPostalLabel> label) {
        super(r2, r3, r4, r5, r6, r0 == null ? new StructuredPostalLabel.Custom("other") : r0);
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(street, "street");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(label, "label");
        String optional = street.getOptional();
        String optional2 = city.getOptional();
        String optional3 = region.getOptional();
        String optional4 = postcode.getOptional();
        String optional5 = country.getOptional();
        StructuredPostalLabel.Custom optional6 = label.getOptional();
        this.dataId = dataId;
        ContentValues contentValues = new ContentValues();
        if (!street.isUndefined()) {
            contentValues.put(Columns.DATA_4, street.getOptional());
        }
        if (!city.isUndefined()) {
            contentValues.put(Columns.DATA_7, city.getOptional());
        }
        if (!region.isUndefined()) {
            contentValues.put(Columns.DATA_8, region.getOptional());
        }
        if (!postcode.isUndefined()) {
            contentValues.put(Columns.DATA_9, postcode.getOptional());
        }
        if (!country.isUndefined()) {
            contentValues.put(Columns.DATA_10, country.getOptional());
        }
        if (!label.isUndefined()) {
            StructuredPostalLabel optional7 = label.getOptional();
            contentValues.put(Columns.TYPE, optional7 != null ? Integer.valueOf(optional7.getType()) : null);
            StructuredPostalLabel optional8 = label.getOptional();
            contentValues.put(Columns.LABEL, optional8 != null ? optional8.getLabel() : null);
        }
        this.contentValues = contentValues;
    }

    @Override // expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalModel, expo.modules.contacts.next.domain.model.Updatable
    public ContentValues getContentValues() {
        return this.contentValues;
    }
}
