package com.vk.qrcode;

import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.akd0;
import xsna.asp;
import xsna.epx;
import xsna.msy;
import xsna.q76;
import xsna.zrp;

/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public final class QRTypes$SmsQrAction extends q76 {
    public a c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QRTypes.kt */
    public static final class FieldType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FieldType[] $VALUES;
        public static final FieldType BODY;
        public static final FieldType PHONE;
        private final int titleId;

        static {
            FieldType fieldType = new FieldType("PHONE", 0, R.string.qr_sms_number);
            PHONE = fieldType;
            FieldType fieldType2 = new FieldType("BODY", 1, R.string.qr_sms_body);
            BODY = fieldType2;
            FieldType[] fieldTypeArr = {fieldType, fieldType2};
            $VALUES = fieldTypeArr;
            $ENTRIES = new asp(fieldTypeArr);
        }

        public FieldType(String str, int i, int i2) {
            this.titleId = i2;
        }

        public static FieldType valueOf(String str) {
            return (FieldType) Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) $VALUES.clone();
        }

        public final int h() {
            return this.titleId;
        }
    }

    /* compiled from: QRTypes.kt */
    public static final class a {
        public final b a;
        public final b b;
        public final Object c = msy.a(LazyThreadSafetyMode.NONE, new akd0(this, 6));

        public a(b bVar, b bVar2) {
            this.a = bVar;
            this.b = bVar2;
        }
    }

    /* compiled from: QRTypes.kt */
    public static final class b {
        public final String a;
        public final FieldType b;

        public b(String str, FieldType fieldType) {
            this.a = str;
            this.b = fieldType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 961);
        }

        public final String toString() {
            return "TypedField(value=" + this.a + ", type=null, fieldType=" + this.b + ')';
        }
    }

    @Override // xsna.q76
    public final <T> io.reactivex.rxjava3.core.q<T> a() {
        return null;
    }

    @Override // xsna.q76
    public final boolean i() {
        return true;
    }

    @Override // xsna.q76
    public final QRTypes$Type q() {
        return QRTypes$Type.SMS;
    }
}
