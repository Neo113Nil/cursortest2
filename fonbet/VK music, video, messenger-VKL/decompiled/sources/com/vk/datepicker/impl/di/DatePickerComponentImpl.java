package com.vk.datepicker.impl.di;

import com.vk.datepicker.api.di.DatePickerComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.lyk;
import xsna.nwy;
import xsna.ozl;
import xsna.qcy;
import xsna.t61;

/* compiled from: DatePickerComponentImpl.kt */
@ozl
/* loaded from: classes17.dex */
public final class DatePickerComponentImpl implements DatePickerComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new t61(20));

    /* compiled from: DatePickerComponentImpl.kt */
    public static final class a implements b7m<DatePickerComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new DatePickerComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DatePickerComponentImpl.class, "datePickerFactory", "getDatePickerFactory()Lcom/vk/datepicker/api/di/DatePickerFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.datepicker.api.di.DatePickerComponent
    public final lyk u0() {
        qcy<Object> qcyVar = b[0];
        return (lyk) this.a.c();
    }
}
