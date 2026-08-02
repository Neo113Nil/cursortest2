package com.vk.qrcode;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.zxing.client.result.AddressBookParsedResult;
import com.google.zxing.client.result.ParsedResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.drm0;
import xsna.epx;
import xsna.m960;
import xsna.msy;
import xsna.q76;
import xsna.zrp;

/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public final class QRTypes$AddressBookQRAction extends q76 {
    public final QRTypes$Type c;
    public final b d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QRTypes.kt */
    public static final class FieldType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FieldType[] $VALUES;
        public static final FieldType ADDRESS;
        public static final FieldType BDAY;
        public static final FieldType EMAIL;
        public static final FieldType NAME;
        public static final FieldType NOTE;
        public static final FieldType ORG;
        public static final FieldType PHONE;
        public static final FieldType SITE;
        public static final FieldType TITLE;
        private final String intentFieldType;
        private Integer intentFieldTypeValue;
        private final String intentType;
        private final int titleId;

        static {
            int i = 0;
            int i2 = R.string.qr_vcard_name;
            FieldType fieldType = new FieldType(i, i2, 12, "NAME", "name", (String) null);
            NAME = fieldType;
            FieldType fieldType2 = new FieldType("BDAY", 1, R.string.qr_vcard_bday, "data1", "data2", (Integer) 3);
            BDAY = fieldType2;
            int i3 = 2;
            int i4 = R.string.qr_vcard_address;
            FieldType fieldType3 = new FieldType(i3, i4, 8, "ADDRESS", "postal", "data2");
            ADDRESS = fieldType3;
            int i5 = 3;
            int i6 = R.string.qr_vcard_phone;
            FieldType fieldType4 = new FieldType(i5, i6, 8, "PHONE", "phone", "phone_type");
            PHONE = fieldType4;
            int i7 = 4;
            int i8 = R.string.qr_vcard_email;
            FieldType fieldType5 = new FieldType(i7, i8, 12, CommonConstant.RETKEY.EMAIL, "email", (String) null);
            EMAIL = fieldType5;
            int i9 = 5;
            int i10 = R.string.qr_vcard_org;
            FieldType fieldType6 = new FieldType(i9, i10, 12, "ORG", "data1", (String) null);
            ORG = fieldType6;
            int i11 = 6;
            int i12 = R.string.qr_vcard_title;
            FieldType fieldType7 = new FieldType(i11, i12, 12, NativeAdContent.ViewTag.AD_TITLE, "job_title", (String) null);
            TITLE = fieldType7;
            int i13 = 7;
            int i14 = R.string.qr_vcard_site;
            FieldType fieldType8 = new FieldType(i13, i14, 12, "SITE", "vnd.android.cursor.item/website", (String) null);
            SITE = fieldType8;
            int i15 = 8;
            int i16 = R.string.qr_vcard_note;
            FieldType fieldType9 = new FieldType(i15, i16, 12, "NOTE", "notes", (String) null);
            NOTE = fieldType9;
            FieldType[] fieldTypeArr = {fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9};
            $VALUES = fieldTypeArr;
            $ENTRIES = new asp(fieldTypeArr);
        }

        public /* synthetic */ FieldType(int i, int i2, int i3, String str, String str2, String str3) {
            this(str, i, i2, str2, (i3 & 4) != 0 ? null : str3, (Integer) null);
        }

        public static FieldType valueOf(String str) {
            return (FieldType) Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) $VALUES.clone();
        }

        public final String h() {
            return this.intentFieldType;
        }

        public final Integer i() {
            return this.intentFieldTypeValue;
        }

        public final String j() {
            return this.intentType;
        }

        public final int k() {
            return this.titleId;
        }

        public final void l(Integer num) {
            this.intentFieldTypeValue = num;
        }

        public FieldType(String str, int i, int i2, String str2, String str3, Integer num) {
            this.titleId = i2;
            this.intentType = str2;
            this.intentFieldType = str3;
            this.intentFieldTypeValue = num;
        }
    }

    /* compiled from: QRTypes.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final FieldType c;

        public a(String str, String str2, FieldType fieldType) {
            this.a = str;
            this.b = str2;
            this.c = fieldType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "TypedField(value=" + this.a + ", type=" + this.b + ", fieldType=" + this.c + ')';
        }
    }

    /* compiled from: QRTypes.kt */
    public static final class b {
        public final a a;
        public final a b;
        public final a c;
        public final a d;
        public final a e;
        public final a f;
        public final a g;
        public final a h;
        public final a i;
        public final Object j = msy.a(LazyThreadSafetyMode.NONE, new m960(this, 19));

        public b(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9) {
            this.a = aVar;
            this.b = aVar2;
            this.c = aVar3;
            this.d = aVar4;
            this.e = aVar5;
            this.f = aVar6;
            this.g = aVar7;
            this.h = aVar8;
            this.i = aVar9;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final List<a> a() {
            return (List) this.j.getValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i);
        }

        public final int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            a aVar2 = this.b;
            int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            a aVar3 = this.c;
            int hashCode3 = (hashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
            a aVar4 = this.d;
            int hashCode4 = (hashCode3 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
            a aVar5 = this.e;
            int hashCode5 = (hashCode4 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
            a aVar6 = this.f;
            int hashCode6 = (hashCode5 + (aVar6 == null ? 0 : aVar6.hashCode())) * 31;
            a aVar7 = this.g;
            int hashCode7 = (hashCode6 + (aVar7 == null ? 0 : aVar7.hashCode())) * 31;
            a aVar8 = this.h;
            int hashCode8 = (hashCode7 + (aVar8 == null ? 0 : aVar8.hashCode())) * 31;
            a aVar9 = this.i;
            return hashCode8 + (aVar9 != null ? aVar9.hashCode() : 0);
        }

        public final String toString() {
            return "VcPayload(name=" + this.a + ", birthday=" + this.b + ", address=" + this.c + ", phone=" + this.d + ", email=" + this.e + ", org=" + this.f + ", title=" + this.g + ", site=" + this.h + ", note=" + this.i + ')';
        }
    }

    public QRTypes$AddressBookQRAction(ParsedResult parsedResult, QRTypes$Type qRTypes$Type) {
        super(parsedResult);
        this.c = qRTypes$Type;
        AddressBookParsedResult addressBookParsedResult = (AddressBookParsedResult) parsedResult;
        this.d = new b(s(addressBookParsedResult.getNames(), null, FieldType.NAME), r(addressBookParsedResult.getBirthday(), FieldType.BDAY), s(addressBookParsedResult.getAddresses(), addressBookParsedResult.getAddressTypes(), FieldType.ADDRESS), s(addressBookParsedResult.getPhoneNumbers(), addressBookParsedResult.getPhoneTypes(), FieldType.PHONE), s(addressBookParsedResult.getEmails(), null, FieldType.EMAIL), r(addressBookParsedResult.getOrg(), FieldType.ORG), r(addressBookParsedResult.getTitle(), FieldType.TITLE), s(addressBookParsedResult.getURLs(), null, FieldType.SITE), r(addressBookParsedResult.getNote(), FieldType.NOTE));
    }

    public static a r(String str, FieldType fieldType) {
        if (str == null || drm0.N(str)) {
            return null;
        }
        return new a(str, null, fieldType);
    }

    public static a s(String[] strArr, String[] strArr2, FieldType fieldType) {
        String str = null;
        if (strArr == null || strArr.length == 0 || drm0.N(strArr[0])) {
            return null;
        }
        if (strArr2 != null && strArr2.length != 0) {
            str = strArr2[0];
        }
        return new a(strArr[0], str, fieldType);
    }

    @Override // xsna.q76
    public final <T> io.reactivex.rxjava3.core.q<T> a() {
        return null;
    }

    @Override // xsna.q76
    public final String g() {
        String str;
        a aVar = this.d.g;
        return (aVar == null || (str = aVar.a) == null) ? new String() : str;
    }

    @Override // xsna.q76
    public final boolean i() {
        return !this.d.a().isEmpty();
    }

    @Override // xsna.q76
    public final QRTypes$Type q() {
        return this.c;
    }
}
