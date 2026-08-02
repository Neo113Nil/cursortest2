package com.google.android.gms.cast.framework.media;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.Preconditions;
import com.sofascore.results.R;
import defpackage.knn;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbk extends ArrayAdapter implements View.OnClickListener {
    public final Context a;
    public int b;

    public zzbk(FragmentActivity fragmentActivity, ArrayList arrayList, int i) {
        super(fragmentActivity, R.layout.cast_tracks_chooser_dialog_row_layout, arrayList == null ? new ArrayList() : arrayList);
        this.a = fragmentActivity;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L23;
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        knn knnVar;
        Context context = this.a;
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            Preconditions.i(layoutInflater);
            view = layoutInflater.inflate(R.layout.cast_tracks_chooser_dialog_row_layout, viewGroup, false);
            knnVar = new knn(this, (TextView) view.findViewById(R.id.text), (RadioButton) view.findViewById(R.id.radio));
            view.setTag(knnVar);
        } else {
            knnVar = (knn) view.getTag();
            Preconditions.i(knnVar);
        }
        RadioButton radioButton = knnVar.b;
        radioButton.setTag(Integer.valueOf(i));
        radioButton.setChecked(this.b == i);
        view.setOnClickListener(this);
        MediaTrack mediaTrack = (MediaTrack) getItem(i);
        Preconditions.i(mediaTrack);
        String str = mediaTrack.e;
        String str2 = mediaTrack.f;
        Locale forLanguageTag = TextUtils.isEmpty(str2) ? null : Locale.forLanguageTag(str2);
        if (TextUtils.isEmpty(str)) {
            if (mediaTrack.g == 2) {
                str = context.getString(R.string.cast_tracks_chooser_dialog_closed_captions);
            } else {
                if (forLanguageTag != null) {
                    str = forLanguageTag.getDisplayLanguage();
                }
                str = context.getString(R.string.cast_tracks_chooser_dialog_default_track_name, Integer.valueOf(i + 1));
            }
        }
        knnVar.a.setText(str);
        return view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        knn knnVar = (knn) view.getTag();
        Preconditions.i(knnVar);
        Object tag = knnVar.b.getTag();
        Preconditions.i(tag);
        this.b = ((Integer) tag).intValue();
        notifyDataSetChanged();
    }
}
