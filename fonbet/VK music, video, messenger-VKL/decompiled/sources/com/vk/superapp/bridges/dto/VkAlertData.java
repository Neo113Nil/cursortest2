package com.vk.superapp.bridges.dto;

import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.k73;
import xsna.ms9;
import xsna.urd0;
import xsna.zrp;

/* compiled from: VkAlertData.kt */
/* loaded from: classes6.dex */
public abstract class VkAlertData {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkAlertData.kt */
    public static final class DialogType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DialogType[] $VALUES;
        public static final DialogType CONFIRMATION;
        public static final DialogType NOWHERE;

        static {
            DialogType dialogType = new DialogType("NOWHERE", 0);
            NOWHERE = dialogType;
            DialogType dialogType2 = new DialogType("CONFIRMATION", 1);
            CONFIRMATION = dialogType2;
            DialogType[] dialogTypeArr = {dialogType, dialogType2};
            $VALUES = dialogTypeArr;
            $ENTRIES = new asp(dialogTypeArr);
        }

        public DialogType() {
            throw null;
        }

        public static DialogType valueOf(String str) {
            return (DialogType) Enum.valueOf(DialogType.class, str);
        }

        public static DialogType[] values() {
            return (DialogType[]) $VALUES.clone();
        }
    }

    /* compiled from: VkAlertData.kt */
    public static final class a {
        public final String a;
        public final Object b;

        public a(String str, Object obj) {
            this.a = str;
            this.b = obj;
        }

        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Object obj = this.b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Action(title=");
            sb.append(this.a);
            sb.append(", payload=");
            return k73.c(sb, this.b, ')');
        }
    }

    /* compiled from: VkAlertData.kt */
    public static final class c extends VkAlertData {
        public final String a;
        public final List<a> b;

        public c(String str, List<a> list) {
            this.a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Sheet(title=");
            sb.append(this.a);
            sb.append(", actions=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: VkAlertData.kt */
    public static final class b extends VkAlertData {
        public final String a;
        public final String b;
        public final DialogType c;
        public final a d;
        public final a e;
        public final a f;

        public b(String str, String str2, DialogType dialogType, a aVar, a aVar2, a aVar3) {
            this.a = str;
            this.b = str2;
            this.c = dialogType;
            this.d = aVar;
            this.e = aVar2;
            this.f = aVar3;
        }

        public final String a() {
            return this.b;
        }

        public final a b() {
            return this.e;
        }

        public final a c() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31;
            a aVar = this.d;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            a aVar2 = this.e;
            int hashCode3 = (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            a aVar3 = this.f;
            return hashCode3 + (aVar3 != null ? aVar3.hashCode() : 0);
        }

        public final String toString() {
            return "Dialog(title=" + this.a + ", message=" + this.b + ", type=" + this.c + ", positive=" + this.d + ", negative=" + this.e + ", neutral=" + this.f + ')';
        }

        public /* synthetic */ b(String str, String str2, DialogType dialogType, a aVar, a aVar2, int i) {
            this(str, str2, (i & 4) != 0 ? DialogType.NOWHERE : dialogType, aVar, (i & 16) != 0 ? null : aVar2, (a) null);
        }
    }
}
