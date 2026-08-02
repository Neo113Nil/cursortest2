package com.google.android.gms.cast.framework.media;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.sofascore.results.R;
import defpackage.enn;
import defpackage.rcb;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class TracksChooserDialogFragment extends DialogFragment {
    public boolean q;
    public ArrayList r;
    public ArrayList s;
    public long[] t;
    public AlertDialog u;
    public RemoteMediaClient v;

    @Deprecated
    public TracksChooserDialogFragment() {
    }

    public static int q(ArrayList arrayList, long[] jArr, int i) {
        if (jArr != null && arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                for (long j : jArr) {
                    if (j == ((MediaTrack) arrayList.get(i2)).a) {
                        return i2;
                    }
                }
            }
        }
        return i;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        int q = q(this.r, this.t, 0);
        int q2 = q(this.s, this.t, -1);
        zzbk zzbkVar = new zzbk(getActivity(), this.r, q);
        zzbk zzbkVar2 = new zzbk(getActivity(), this.s, q2);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.cast_tracks_chooser_dialog_layout, (ViewGroup) null);
        ListView listView = (ListView) inflate.findViewById(R.id.text_list_view);
        ListView listView2 = (ListView) inflate.findViewById(R.id.audio_list_view);
        TabHost tabHost = (TabHost) inflate.findViewById(R.id.tab_host);
        tabHost.setup();
        if (zzbkVar.getCount() == 0) {
            listView.setVisibility(4);
        } else {
            listView.setAdapter((ListAdapter) zzbkVar);
            TabHost.TabSpec newTabSpec = tabHost.newTabSpec("textTab");
            newTabSpec.setContent(R.id.text_list_view);
            newTabSpec.setIndicator(String.format(Locale.ROOT, getActivity().getString(R.string.cast_tracks_chooser_dialog_subtitles), new Object[0]));
            tabHost.addTab(newTabSpec);
        }
        if (zzbkVar2.getCount() <= 1) {
            listView2.setVisibility(4);
        } else {
            listView2.setAdapter((ListAdapter) zzbkVar2);
            TabHost.TabSpec newTabSpec2 = tabHost.newTabSpec("audioTab");
            newTabSpec2.setContent(R.id.audio_list_view);
            newTabSpec2.setIndicator(String.format(Locale.ROOT, getActivity().getString(R.string.cast_tracks_chooser_dialog_audio), new Object[0]));
            tabHost.addTab(newTabSpec2);
        }
        AlertDialog.Builder view = builder.setView(inflate);
        Locale locale = Locale.ROOT;
        view.setPositiveButton(String.format(locale, getActivity().getString(R.string.cast_tracks_chooser_dialog_ok), new Object[0]), new enn(0, this, zzbkVar, zzbkVar2)).setNegativeButton(String.format(locale, getActivity().getString(R.string.cast_tracks_chooser_dialog_cancel), new Object[0]), new rcb(this, 1));
        AlertDialog alertDialog = this.u;
        if (alertDialog != null) {
            alertDialog.cancel();
            this.u = null;
        }
        AlertDialog create = builder.create();
        this.u = create;
        return create;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.q = true;
        this.s = new ArrayList();
        this.r = new ArrayList();
        this.t = new long[0];
        CastSession c = CastContext.c(getContext()).b().c();
        if (c != null && c.c()) {
            RemoteMediaClient k = c.k();
            this.v = k;
            if (k != null && k.k() && this.v.f() != null) {
                RemoteMediaClient remoteMediaClient = this.v;
                MediaStatus h = remoteMediaClient.h();
                if (h != null) {
                    this.t = h.k;
                }
                MediaInfo f = remoteMediaClient.f();
                if (f == null) {
                    this.q = false;
                    return;
                }
                List<MediaTrack> list = f.f;
                if (list == null) {
                    this.q = false;
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (MediaTrack mediaTrack : list) {
                    if (mediaTrack.b == 2) {
                        arrayList.add(mediaTrack);
                    }
                }
                this.s = arrayList;
                ArrayList arrayList2 = new ArrayList();
                for (MediaTrack mediaTrack2 : list) {
                    if (mediaTrack2.b == 1) {
                        arrayList2.add(mediaTrack2);
                    }
                }
                this.r = arrayList2;
                if (arrayList2.isEmpty()) {
                    return;
                }
                ArrayList arrayList3 = this.r;
                MediaTrack.Builder builder = new MediaTrack.Builder();
                builder.c = 0;
                builder.b = String.format(Locale.ROOT, getActivity().getString(R.string.cast_tracks_chooser_dialog_none), new Object[0]);
                builder.c = 2;
                builder.a = "";
                arrayList3.add(0, new MediaTrack(-1L, 1, builder.a, null, builder.b, null, builder.c, null, null));
                return;
            }
        }
        this.q = false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = this.l;
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }
}
