package te;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.sports.insider.R;
import com.sports.insider.data.repository.room.support.dp.impl.FrequentQuestionsTable;
import com.sports.insider.domain.entity.CustomTypefaceSpan;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends ge.i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23871c = 0;

    public static final TextView n(FlexboxLayout flexboxLayout, String str, String str2) {
        if (str2 == null || str == null) {
            return null;
        }
        TextView textView = new TextView(flexboxLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMargins(0, io.sentry.config.a.o(4), 0, io.sentry.config.a.o(4));
        }
        textView.setPadding(io.sentry.config.a.o(17), io.sentry.config.a.o(8), io.sentry.config.a.o(16), io.sentry.config.a.o(8));
        textView.setGravity(17);
        Context context = flexboxLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "<this>");
        textView.setBackground(context.getDrawable(R.drawable.background_question_support));
        textView.setStateListAnimator(AnimatorInflater.loadStateListAnimator(flexboxLayout.getContext(), R.animator.button_animator));
        textView.setText(str);
        textView.setTextColor(-1);
        textView.setTag(str2);
        textView.setTextSize(2, 14.0f);
        try {
            Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Intrinsics.checkNotNullParameter(context2, "<this>");
            CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("arimo_regular", f0.l.b(context2, R.font.arimo_regular));
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(textView.getText());
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
            k2.x.B(valueOf, 0, textView.getText().length(), customTypefaceSpan);
            textView.setText(valueOf);
        } catch (Exception unused) {
        }
        flexboxLayout.addView(textView);
        return textView;
    }

    public final void m(ka.a aVar) {
        ec.i iVar = (ec.i) ((b3.a) this.f9975a);
        TextView textView = iVar.f8953c;
        String str = aVar.f18952h;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        FlexboxLayout flexboxLayout = iVar.f8952b;
        Intrinsics.checkNotNull(flexboxLayout);
        final q qVar = (q) this.f9976b;
        String str2 = aVar.f18954k;
        if (Intrinsics.areEqual(aVar.j, "application/json") && str2 != null) {
            flexboxLayout.removeAllViews();
            Intrinsics.checkNotNull(str2);
            JSONArray jSONArray = new JSONArray(str2);
            Iterator it = zf.j.d(0, jSONArray.length()).iterator();
            while (((zf.b) it).f25972c) {
                Object obj = jSONArray.get(((kotlin.collections.i0) it).nextInt());
                JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
                if (jSONObject != null) {
                    int i5 = jSONObject.getInt("id");
                    String string = jSONObject.getString(FrequentQuestionsTable.columnQuestion);
                    if (i5 >= 500) {
                        TextView n9 = n(flexboxLayout, string, jSONObject.getString(FrequentQuestionsTable.columnAnswer));
                        if (n9 != null) {
                            final int i10 = 0;
                            n9.setOnClickListener(new View.OnClickListener() { // from class: te.d
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i10) {
                                        case 0:
                                            p pVar = qVar;
                                            if (pVar != null) {
                                                Object tag = view.getTag();
                                                pVar.a(tag instanceof String ? (String) tag : null);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            p pVar2 = qVar;
                                            if (pVar2 != null) {
                                                Object tag2 = view.getTag();
                                                String str3 = tag2 instanceof String ? (String) tag2 : null;
                                                pVar2.d(str3 != null ? Integer.parseInt(str3) : 0);
                                                break;
                                            }
                                            break;
                                        default:
                                            p pVar3 = qVar;
                                            if (pVar3 != null) {
                                                pVar3.d(0);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                    } else {
                        TextView n10 = n(flexboxLayout, string, String.valueOf(i5));
                        if (n10 != null) {
                            final int i11 = 1;
                            n10.setOnClickListener(new View.OnClickListener() { // from class: te.d
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i11) {
                                        case 0:
                                            p pVar = qVar;
                                            if (pVar != null) {
                                                Object tag = view.getTag();
                                                pVar.a(tag instanceof String ? (String) tag : null);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            p pVar2 = qVar;
                                            if (pVar2 != null) {
                                                Object tag2 = view.getTag();
                                                String str3 = tag2 instanceof String ? (String) tag2 : null;
                                                pVar2.d(str3 != null ? Integer.parseInt(str3) : 0);
                                                break;
                                            }
                                            break;
                                        default:
                                            p pVar3 = qVar;
                                            if (pVar3 != null) {
                                                pVar3.d(0);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                    }
                }
            }
            TextView n11 = n(flexboxLayout, flexboxLayout.getResources().getString(R.string.Another_question), "other_question");
            if (n11 != null) {
                final int i12 = 2;
                n11.setOnClickListener(new View.OnClickListener() { // from class: te.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                p pVar = qVar;
                                if (pVar != null) {
                                    Object tag = view.getTag();
                                    pVar.a(tag instanceof String ? (String) tag : null);
                                    break;
                                }
                                break;
                            case 1:
                                p pVar2 = qVar;
                                if (pVar2 != null) {
                                    Object tag2 = view.getTag();
                                    String str3 = tag2 instanceof String ? (String) tag2 : null;
                                    pVar2.d(str3 != null ? Integer.parseInt(str3) : 0);
                                    break;
                                }
                                break;
                            default:
                                p pVar3 = qVar;
                                if (pVar3 != null) {
                                    pVar3.d(0);
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
    }
}
