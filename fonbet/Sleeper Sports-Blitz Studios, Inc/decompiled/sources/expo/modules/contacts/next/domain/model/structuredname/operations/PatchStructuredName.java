package expo.modules.contacts.next.domain.model.structuredname.operations;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.structuredname.StructuredNameModel;
import expo.modules.kotlin.types.ValueOrUndefined;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PatchStructuredName.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredname/operations/PatchStructuredName;", "Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;", "Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "givenName", "Lexpo/modules/kotlin/types/ValueOrUndefined;", "", "middleName", "familyName", "prefix", "suffix", "phoneticGivenName", "phoneticMiddleName", "phoneticFamilyName", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDataId-sXKVoX8", "()Ljava/lang/String;", "Ljava/lang/String;", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PatchStructuredName extends StructuredNameModel implements Updatable.Data {
    private final ContentValues contentValues;
    private final String dataId;

    public /* synthetic */ PatchStructuredName(String str, ValueOrUndefined valueOrUndefined, ValueOrUndefined valueOrUndefined2, ValueOrUndefined valueOrUndefined3, ValueOrUndefined valueOrUndefined4, ValueOrUndefined valueOrUndefined5, ValueOrUndefined valueOrUndefined6, ValueOrUndefined valueOrUndefined7, ValueOrUndefined valueOrUndefined8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, valueOrUndefined, valueOrUndefined2, valueOrUndefined3, valueOrUndefined4, valueOrUndefined5, valueOrUndefined6, valueOrUndefined7, valueOrUndefined8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PatchStructuredName(String str, ValueOrUndefined valueOrUndefined, ValueOrUndefined valueOrUndefined2, ValueOrUndefined valueOrUndefined3, ValueOrUndefined valueOrUndefined4, ValueOrUndefined valueOrUndefined5, ValueOrUndefined valueOrUndefined6, ValueOrUndefined valueOrUndefined7, ValueOrUndefined valueOrUndefined8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r5, r6, r7, r8, r9, r10, r11, r12, null);
        ValueOrUndefined valueOrUndefined9;
        ValueOrUndefined valueOrUndefined10;
        ValueOrUndefined valueOrUndefined11;
        ValueOrUndefined valueOrUndefined12;
        ValueOrUndefined valueOrUndefined13;
        ValueOrUndefined valueOrUndefined14;
        ValueOrUndefined valueOrUndefined15;
        ValueOrUndefined valueOrUndefined16;
        if ((i & 2) != 0) {
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined9 = undefined;
        } else {
            valueOrUndefined9 = valueOrUndefined;
        }
        if ((i & 4) != 0) {
            ValueOrUndefined.Companion companion2 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined2 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined2, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined10 = undefined2;
        } else {
            valueOrUndefined10 = valueOrUndefined2;
        }
        if ((i & 8) != 0) {
            ValueOrUndefined.Companion companion3 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined3 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined3, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined11 = undefined3;
        } else {
            valueOrUndefined11 = valueOrUndefined3;
        }
        if ((i & 16) != 0) {
            ValueOrUndefined.Companion companion4 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined4 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined4, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined12 = undefined4;
        } else {
            valueOrUndefined12 = valueOrUndefined4;
        }
        if ((i & 32) != 0) {
            ValueOrUndefined.Companion companion5 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined5 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined5, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined13 = undefined5;
        } else {
            valueOrUndefined13 = valueOrUndefined5;
        }
        if ((i & 64) != 0) {
            ValueOrUndefined.Companion companion6 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined6 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined6, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined14 = undefined6;
        } else {
            valueOrUndefined14 = valueOrUndefined6;
        }
        if ((i & 128) != 0) {
            ValueOrUndefined.Companion companion7 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined7 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined7, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined15 = undefined7;
        } else {
            valueOrUndefined15 = valueOrUndefined7;
        }
        if ((i & 256) != 0) {
            ValueOrUndefined.Companion companion8 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined8 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined8, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined16 = undefined8;
        } else {
            valueOrUndefined16 = valueOrUndefined8;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private PatchStructuredName(String dataId, ValueOrUndefined<String> givenName, ValueOrUndefined<String> middleName, ValueOrUndefined<String> familyName, ValueOrUndefined<String> prefix, ValueOrUndefined<String> suffix, ValueOrUndefined<String> phoneticGivenName, ValueOrUndefined<String> phoneticMiddleName, ValueOrUndefined<String> phoneticFamilyName) {
        super(givenName.getOptional(), middleName.getOptional(), familyName.getOptional(), prefix.getOptional(), suffix.getOptional(), phoneticGivenName.getOptional(), phoneticMiddleName.getOptional(), phoneticFamilyName.getOptional());
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(givenName, "givenName");
        Intrinsics.checkNotNullParameter(middleName, "middleName");
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(phoneticGivenName, "phoneticGivenName");
        Intrinsics.checkNotNullParameter(phoneticMiddleName, "phoneticMiddleName");
        Intrinsics.checkNotNullParameter(phoneticFamilyName, "phoneticFamilyName");
        this.dataId = dataId;
        ContentValues contentValues = new ContentValues();
        if (!givenName.isUndefined()) {
            contentValues.put(Columns.TYPE, givenName.getOptional());
        }
        if (!middleName.isUndefined()) {
            contentValues.put(Columns.DATA_5, middleName.getOptional());
        }
        if (!familyName.isUndefined()) {
            contentValues.put(Columns.LABEL, familyName.getOptional());
        }
        if (!prefix.isUndefined()) {
            contentValues.put(Columns.DATA_4, prefix.getOptional());
        }
        if (!suffix.isUndefined()) {
            contentValues.put(Columns.DATA_6, suffix.getOptional());
        }
        if (!phoneticGivenName.isUndefined()) {
            contentValues.put(Columns.DATA_7, phoneticGivenName.getOptional());
        }
        if (!phoneticMiddleName.isUndefined()) {
            contentValues.put(Columns.DATA_8, phoneticMiddleName.getOptional());
        }
        if (!phoneticFamilyName.isUndefined()) {
            contentValues.put(Columns.DATA_9, phoneticFamilyName.getOptional());
        }
        this.contentValues = contentValues;
    }

    @Override // expo.modules.contacts.next.domain.model.structuredname.StructuredNameModel, expo.modules.contacts.next.domain.model.Updatable
    public ContentValues getContentValues() {
        return this.contentValues;
    }
}
