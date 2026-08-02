package expo.modules.contacts.next.domain.model.structuredpostal;

import android.content.ContentValues;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.Columns;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StructuredPostalModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;", "", "street", "", "city", "region", "postcode", "country", Constants.ScionAnalytics.PARAM_LABEL, "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;)V", "getStreet", "()Ljava/lang/String;", "getCity", "getRegion", "getPostcode", "getCountry", "getLabel", "()Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;", "mimeType", "getMimeType", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class StructuredPostalModel {
    private final String city;
    private final ContentValues contentValues;
    private final String country;
    private final StructuredPostalLabel label;
    private final String mimeType;
    private final String postcode;
    private final String region;
    private final String street;

    public StructuredPostalModel(String str, String str2, String str3, String str4, String str5, StructuredPostalLabel label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.street = str;
        this.city = str2;
        this.region = str3;
        this.postcode = str4;
        this.country = str5;
        this.label = label;
        this.mimeType = "vnd.android.cursor.item/postal-address_v2";
        ContentValues contentValues = new ContentValues();
        contentValues.put(Columns.MIMETYPE, "vnd.android.cursor.item/postal-address_v2");
        contentValues.put(Columns.DATA_4, str);
        contentValues.put(Columns.DATA_7, str2);
        contentValues.put(Columns.DATA_8, str3);
        contentValues.put(Columns.DATA_9, str4);
        contentValues.put(Columns.DATA_10, str5);
        contentValues.put(Columns.TYPE, Integer.valueOf(label.getType()));
        contentValues.put(Columns.LABEL, label.getLabel());
        this.contentValues = contentValues;
    }

    public final String getStreet() {
        return this.street;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getPostcode() {
        return this.postcode;
    }

    public final String getCountry() {
        return this.country;
    }

    public final StructuredPostalLabel getLabel() {
        return this.label;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public ContentValues getContentValues() {
        return this.contentValues;
    }
}
