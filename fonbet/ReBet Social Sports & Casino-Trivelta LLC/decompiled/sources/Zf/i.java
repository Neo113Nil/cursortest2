package Zf;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.P;
import java.util.List;
import od.AbstractC5886l;
import od.q;
import od.r;
import rd.C6218a;

/* loaded from: classes4.dex */
public class i extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public List f14823a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f14824b;

    public i(Activity activity, List list) {
        this.f14823a = list;
        this.f14824b = activity;
    }

    public static int a(int i10) {
        return (int) (i10 * Resources.getSystem().getDisplayMetrics().density);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f14823a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f14823a.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View inflate = ((LayoutInflater) this.f14824b.getSystemService("layout_inflater")).inflate(r.f60808s, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(q.f60581l4);
        TextView textView = (TextView) inflate.findViewById(q.f60251F1);
        textView.setTypeface(C6218a.P());
        Channel.Department department = (Channel.Department) this.f14823a.get(i10);
        Bitmap createBitmap = Bitmap.createBitmap(a(24), a(24), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(10.0f);
        paint.setStyle(Paint.Style.FILL);
        if (department == null || department.isOnline() == null || department.isOnline() != Boolean.TRUE) {
            paint.setColor(P.e(imageView.getContext(), AbstractC5886l.f59833h0));
        } else {
            paint.setColor(P.e(imageView.getContext(), AbstractC5886l.f59823f0));
        }
        canvas.drawCircle(a(12), a(12), a(10), paint);
        imageView.setImageBitmap(createBitmap);
        if (department != null) {
            String unescapeHtml = LiveChatUtil.unescapeHtml(department.getName());
            if (unescapeHtml != null) {
                textView.setText(unescapeHtml);
                return inflate;
            }
            textView.setText(department.getName());
        }
        return inflate;
    }
}
