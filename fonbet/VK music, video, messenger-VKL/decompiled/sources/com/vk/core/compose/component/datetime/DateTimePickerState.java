package com.vk.core.compose.component.datetime;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.compose.component.datetime.b;
import com.vk.core.compose.component.datetime.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import xsna.asp;
import xsna.b1h;
import xsna.bbk0;
import xsna.dof;
import xsna.e43;
import xsna.epx;
import xsna.f1m;
import xsna.k9x;
import xsna.pce;
import xsna.qow;
import xsna.s3q0;
import xsna.wh50;
import xsna.zak0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: DateTimePickerState.kt */
/* loaded from: classes17.dex */
public final class DateTimePickerState extends n {
    public UpdateValueFromDialogsStrategy g;
    public final f1m h;
    public final f1m i;
    public final f1m j;
    public final wh50 k;

    /* compiled from: DateTimePickerState.kt */
    public static abstract class DialogState implements Parcelable {

        /* compiled from: DateTimePickerState.kt */
        public static final class Closed extends DialogState {
            public static final Closed b = new Closed(null);
            public static final Parcelable.Creator<Closed> CREATOR = new a();

            /* compiled from: DateTimePickerState.kt */
            public static final class a implements Parcelable.Creator<Closed> {
                @Override // android.os.Parcelable.Creator
                public final Closed createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Closed.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Closed[] newArray(int i) {
                    return new Closed[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Closed);
            }

            public final int hashCode() {
                return -1396610822;
            }

            public final String toString() {
                return "Closed";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: DateTimePickerState.kt */
        public static final class DatePicker extends DialogState {
            public static final DatePicker b = new DatePicker(null);
            public static final Parcelable.Creator<DatePicker> CREATOR = new a();

            /* compiled from: DateTimePickerState.kt */
            public static final class a implements Parcelable.Creator<DatePicker> {
                @Override // android.os.Parcelable.Creator
                public final DatePicker createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return DatePicker.b;
                }

                @Override // android.os.Parcelable.Creator
                public final DatePicker[] newArray(int i) {
                    return new DatePicker[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DatePicker);
            }

            public final int hashCode() {
                return -1068041622;
            }

            public final String toString() {
                return "DatePicker";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: DateTimePickerState.kt */
        public static final class TimePicker extends DialogState {
            public static final Parcelable.Creator<TimePicker> CREATOR = new a();
            public final Object b;

            /* compiled from: DateTimePickerState.kt */
            public static final class a implements Parcelable.Creator<TimePicker> {
                @Override // android.os.Parcelable.Creator
                public final TimePicker createFromParcel(Parcel parcel) {
                    return new TimePicker(new Date(parcel.readLong()), null);
                }

                @Override // android.os.Parcelable.Creator
                public final TimePicker[] newArray(int i) {
                    return new TimePicker[i];
                }
            }

            public TimePicker(Object obj, zcl zclVar) {
                super(null);
                this.b = obj;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TimePicker) && epx.f(this.b, ((TimePicker) obj).b);
            }

            public final int hashCode() {
                return qow.a(this.b);
            }

            public final String toString() {
                return "TimePicker(selectedDate=" + ((Object) qow.b(this.b)) + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeLong(((Date) this.b).getTime());
            }
        }

        public /* synthetic */ DialogState(zcl zclVar) {
            this();
        }

        public DialogState() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DateTimePickerState.kt */
    public static final class UpdateValueFromDialogsStrategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UpdateValueFromDialogsStrategy[] $VALUES;
        public static final UpdateValueFromDialogsStrategy Instant;
        public static final UpdateValueFromDialogsStrategy Transaction;

        static {
            UpdateValueFromDialogsStrategy updateValueFromDialogsStrategy = new UpdateValueFromDialogsStrategy("Instant", 0);
            Instant = updateValueFromDialogsStrategy;
            UpdateValueFromDialogsStrategy updateValueFromDialogsStrategy2 = new UpdateValueFromDialogsStrategy("Transaction", 1);
            Transaction = updateValueFromDialogsStrategy2;
            UpdateValueFromDialogsStrategy[] updateValueFromDialogsStrategyArr = {updateValueFromDialogsStrategy, updateValueFromDialogsStrategy2};
            $VALUES = updateValueFromDialogsStrategyArr;
            $ENTRIES = new asp(updateValueFromDialogsStrategyArr);
        }

        public UpdateValueFromDialogsStrategy() {
            throw null;
        }

        public static zrp<UpdateValueFromDialogsStrategy> h() {
            return $ENTRIES;
        }

        public static UpdateValueFromDialogsStrategy valueOf(String str) {
            return (UpdateValueFromDialogsStrategy) Enum.valueOf(UpdateValueFromDialogsStrategy.class, str);
        }

        public static UpdateValueFromDialogsStrategy[] values() {
            return (UpdateValueFromDialogsStrategy[]) $VALUES.clone();
        }
    }

    /* compiled from: DateTimePickerState.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdateValueFromDialogsStrategy.values().length];
            try {
                iArr[UpdateValueFromDialogsStrategy.Instant.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpdateValueFromDialogsStrategy.Transaction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DateTimePickerState(Date date) {
        this(date, r0, l.a.C0740a.b, UpdateValueFromDialogsStrategy.Instant);
        k9x k9xVar = c.d;
        l.a.getClass();
    }

    @Override // com.vk.core.compose.component.datetime.n
    public final boolean c() {
        Date date = (Date) this.j.getValue();
        return date != null && b().b(date);
    }

    public final void e(Date date, Date date2) {
        m mVar = this.a;
        b a2 = mVar.a();
        if (date == null) {
            a2.b(h.a);
        } else {
            a2.g(h.a, h.d.format(date));
        }
        if (date2 == null) {
            a2.b(h.c);
        } else {
            b.C0739b c0739b = h.c;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
            simpleDateFormat.setLenient(false);
            a2.g(c0739b, simpleDateFormat.format(date2));
        }
        s3q0 s3q0Var = s3q0.a;
        ((zak0) mVar.a).setValue(mVar.a());
    }

    public DateTimePickerState(k9x k9xVar, l lVar, UpdateValueFromDialogsStrategy updateValueFromDialogsStrategy, DialogState dialogState) {
        super(k9xVar, lVar, new m(new b(e43.l(h.a, h.b, h.c), c.c)));
        this.g = updateValueFromDialogsStrategy;
        this.h = bbk0.b(new pce(this, 16));
        this.i = bbk0.b(new dof(this, 14));
        this.j = bbk0.b(new b1h(this, 6));
        this.k = androidx.compose.runtime.k.b(dialogState);
    }

    public DateTimePickerState(Date date, k9x k9xVar, l lVar, UpdateValueFromDialogsStrategy updateValueFromDialogsStrategy) {
        this(k9xVar, lVar, updateValueFromDialogsStrategy, DialogState.Closed.b);
        e(date, date);
    }
}
