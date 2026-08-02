package org.maplibre.android.maps;

import Tf.a;
import Tf.b;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.maplibre.android.MapLibre;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.style.sources.Source;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public class AttributionDialogManager implements View.OnClickListener, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Context f79656a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final MapLibreMap f79657b;

    /* renamed from: c, reason: collision with root package name */
    private Set<a> f79658c;

    /* renamed from: d, reason: collision with root package name */
    private AlertDialog f79659d;

    private static class AttributionBuilder {

        /* renamed from: a, reason: collision with root package name */
        private final MapLibreMap f79660a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        private final WeakReference<Context> f79661b;

        AttributionBuilder(Context context, MapLibreMap mapLibreMap) {
            this.f79660a = mapLibreMap;
            this.f79661b = new WeakReference<>(context);
        }

        static Set a(AttributionBuilder attributionBuilder) {
            Context context = attributionBuilder.f79661b.get();
            if (context == null) {
                return Collections.EMPTY_SET;
            }
            ArrayList arrayList = new ArrayList();
            Style u11 = attributionBuilder.f79660a.u();
            if (u11 != null) {
                Iterator<Source> it = u11.l().iterator();
                while (it.hasNext()) {
                    String attribution = it.next().getAttribution();
                    if (!attribution.isEmpty()) {
                        arrayList.add(attribution);
                    }
                }
            }
            b.a aVar = new b.a(context);
            aVar.c(true);
            aVar.d(true);
            aVar.b((String[]) arrayList.toArray(new String[arrayList.size()]));
            return aVar.a().a();
        }
    }

    public AttributionDialogManager(@NonNull Context context, @NonNull MapLibreMap mapLibreMap) {
        this.f79656a = context;
        this.f79657b = mapLibreMap;
    }

    public final void a() {
        AlertDialog alertDialog = this.f79659d;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.f79659d.dismiss();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NonNull View view) {
        this.f79658c = AttributionBuilder.a(new AttributionBuilder(view.getContext(), this.f79657b));
        Context context = this.f79656a;
        if (context instanceof Activity ? ((Activity) context).isFinishing() : false) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<a> it = this.f79658c.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.maplibre_attributionsDialogTitle);
        builder.setAdapter(new ArrayAdapter(context, R.layout.maplibre_attribution_list_item, strArr), this);
        this.f79659d = builder.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        Set<a> set = this.f79658c;
        String b11 = ((a[]) set.toArray(new a[set.size()]))[i11].b();
        boolean contains = b11.contains("https://www.mapbox.com/map-feedback");
        Context context = this.f79656a;
        if (contains || b11.contains("https://apps.mapbox.com/feedback")) {
            String apiKey = MapLibre.getApiKey();
            Uri.Builder buildUpon = Uri.parse("https://apps.mapbox.com/feedback").buildUpon();
            MapLibreMap mapLibreMap = this.f79657b;
            CameraPosition k11 = mapLibreMap.k();
            if (k11 != null) {
                buildUpon.encodedFragment(String.format(Locale.getDefault(), "/%f/%f/%f/%f/%d", Double.valueOf(k11.target.getLongitude()), Double.valueOf(k11.target.getLatitude()), Double.valueOf(k11.zoom), Double.valueOf(k11.bearing), Integer.valueOf((int) k11.tilt)));
            }
            String packageName = context.getApplicationContext().getPackageName();
            if (packageName != null) {
                buildUpon.appendQueryParameter("referrer", packageName);
            }
            if (apiKey != null) {
                buildUpon.appendQueryParameter("access_token", apiKey);
            }
            Style u11 = mapLibreMap.u();
            if (u11 != null) {
                Matcher matcher = Pattern.compile("^(.*://[^:^/]*)/(.*)/(.*)").matcher(u11.m());
                if (matcher.find()) {
                    String group = matcher.group(2);
                    buildUpon.appendQueryParameter("owner", group).appendQueryParameter("id", matcher.group(3));
                }
            }
            b11 = buildUpon.build().toString();
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(b11));
            context.startActivity(intent);
        } catch (ActivityNotFoundException e11) {
            Toast.makeText(context, R.string.maplibre_attributionErrorNoBrowser, 1).show();
            org.maplibre.android.b.b(e11);
        }
    }
}
