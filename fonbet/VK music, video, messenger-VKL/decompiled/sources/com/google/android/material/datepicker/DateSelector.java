package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import xsna.vm10;

/* loaded from: classes13.dex */
public interface DateSelector<S> extends Parcelable {
    void B8(long j);

    @NonNull
    String T4(Context context);

    @NonNull
    View e3(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @NonNull CalendarConstraints calendarConstraints, @NonNull vm10.a aVar);

    int g2(Context context);

    @NonNull
    ArrayList ia();

    boolean j8();

    @NonNull
    String q4(@NonNull Context context);

    @Nullable
    Long q8();

    @NonNull
    ArrayList x3();
}
