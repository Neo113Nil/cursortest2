package ru.ozon.fintech.ui.toolbar;

import Ar.c;
import Ar.d;
import B90.N;
import C.D;
import DN.b;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/ui/toolbar/FinToolbarView;", "Landroidx/appcompat/widget/Toolbar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroid/widget/TextView;", "subtitle", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleLayout", "Landroid/widget/LinearLayout;", "rightText", "leftText", "avatarText", "avatarImage", "Landroid/widget/ImageView;", "state", "Lru/ozon/fintech/ui/toolbar/FinToolbarState;", "getState", "()Lru/ozon/fintech/ui/toolbar/FinToolbarState;", "setState", "(Lru/ozon/fintech/ui/toolbar/FinToolbarState;)V", "bindState", "", "toolbarState", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinToolbarView extends Toolbar {

    @NotNull
    private static final String TAG = "FinToolbarView";
    private ImageView avatarImage;
    private TextAtomView avatarText;
    private TextAtomView leftText;
    private TextAtomView rightText;
    public FinToolbarState state;
    private TextAtomView subtitle;
    private TextView title;
    private LinearLayout titleLayout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinToolbarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$10(FinToolbarView finToolbarView, MenuItem menuItem) {
        Function1<MenuItem, Unit> menuItemClicked = finToolbarView.getState().getMenuItemClicked();
        if (menuItemClicked == null) {
            return false;
        }
        Intrinsics.f(menuItem);
        menuItemClicked.invoke(menuItem);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$8(FinToolbarView finToolbarView, View view) {
        Function0<Unit> navigationClicked = finToolbarView.getState().getNavigationClicked();
        if (navigationClicked != null) {
            navigationClicked.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(FinToolbarView finToolbarView, View view) {
        Function0<Unit> rightAtomClicked = finToolbarView.getState().getRightAtomClicked();
        if (rightAtomClicked != null) {
            rightAtomClicked.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(FinToolbarView finToolbarView, View view) {
        Function0<Unit> leftAtomClicked = finToolbarView.getState().getLeftAtomClicked();
        if (leftAtomClicked != null) {
            leftAtomClicked.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$5$lambda$4(FinToolbarView finToolbarView, View view) {
        Function0<Unit> avatarClicked = finToolbarView.getState().getAvatarClicked();
        if (avatarClicked != null) {
            avatarClicked.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$7$lambda$6(FinToolbarView finToolbarView, View view) {
        Function0<Unit> avatarClicked = finToolbarView.getState().getAvatarClicked();
        if (avatarClicked != null) {
            avatarClicked.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindState(@NotNull FinToolbarState toolbarState) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        setState(toolbarState);
        ImageTransformation.RoundedCorners.CornerType cornerType = null;
        Object[] objArr = 0;
        if (toolbarState.getNavigationIcon() == null) {
            setNavigationIcon((Drawable) null);
        } else {
            setNavigationIcon(toolbarState.getNavigationIcon().intValue());
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, toolbarState.getNavigationIconColor());
            if (parseColor != null) {
                int intValue = parseColor.intValue();
                Drawable navigationIcon = getNavigationIcon();
                if (navigationIcon != null) {
                    navigationIcon.setColorFilter(intValue, PorterDuff.Mode.SRC_IN);
                }
            }
        }
        Menu menu = getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (toolbarState.getMenuResId() != null) {
            inflateMenu(toolbarState.getMenuResId().intValue());
            if (toolbarState.getExternalMenuIconId() != null) {
                MenuItem item = getMenu().getItem(0);
                item.setIcon(a.getDrawable(getContext(), toolbarState.getExternalMenuIconId().intValue()));
                StyleParser styleParser2 = StyleParser.INSTANCE;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Integer parseColor2 = styleParser2.parseColor(context2, toolbarState.getMenuResColor());
                if (parseColor2 != null) {
                    int intValue2 = parseColor2.intValue();
                    Drawable icon = item.getIcon();
                    if (icon != null) {
                        icon.setColorFilter(intValue2, PorterDuff.Mode.SRC_IN);
                    }
                }
            }
        }
        TextAtom rightAtomText = toolbarState.getRightAtomText();
        int i11 = 2;
        if (rightAtomText != null) {
            TextAtomView textAtomView = this.rightText;
            if (textAtomView != null) {
                TextAtomHolderKt.bind$default(textAtomView, rightAtomText, null, 2, null);
            }
            TextAtomView textAtomView2 = this.rightText;
            if (textAtomView2 != null) {
                textAtomView2.setVisibility(0);
            }
        } else {
            TextAtomView textAtomView3 = this.rightText;
            if (textAtomView3 != null) {
                textAtomView3.setVisibility(8);
            }
        }
        if (toolbarState.getAvatarSrc() != null && toolbarState.getLeftAtomText() != null) {
            TextAtomView textAtomView4 = this.avatarText;
            if (textAtomView4 != null) {
                TextAtomHolderKt.bind$default(textAtomView4, toolbarState.getLeftAtomText(), null, 2, null);
            }
            TextAtomView textAtomView5 = this.avatarText;
            if (textAtomView5 != null) {
                textAtomView5.setVisibility(0);
            }
            ImageView imageView = this.avatarImage;
            if (imageView != null) {
                ImageViewExtKt.load$default(imageView, toolbarState.getAvatarSrc(), C7714v.a0(new ImageTransformation.RoundedCorners(D.d(12), cornerType, i11, objArr == true ? 1 : 0)), new FinToolbarView$bindState$5(this), null, null, false, null, 120, null);
            }
            StyleParser styleParser3 = StyleParser.INSTANCE;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer parseColor3 = styleParser3.parseColor(context3, toolbarState.getAvatarColor());
            if (parseColor3 != null) {
                int intValue3 = parseColor3.intValue();
                ImageView imageView2 = this.avatarImage;
                if (imageView2 != null) {
                    imageView2.setColorFilter(intValue3, PorterDuff.Mode.SRC_IN);
                }
            }
            ImageView imageView3 = this.avatarImage;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            TextAtomView textAtomView6 = this.leftText;
            if (textAtomView6 != null) {
                textAtomView6.setVisibility(8);
            }
        } else if (toolbarState.getSubTitle() != null && toolbarState.getTitle() != null) {
            TextView textView = this.title;
            if (textView != null) {
                textView.setText(toolbarState.getTitle());
            }
            TextAtomView textAtomView7 = this.subtitle;
            if (textAtomView7 != null) {
                textAtomView7.setText(toolbarState.getSubTitle());
            }
            TextView textView2 = this.title;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextAtomView textAtomView8 = this.subtitle;
            if (textAtomView8 != null) {
                textAtomView8.setVisibility(0);
            }
        } else if (toolbarState.getSubTitle() == null && toolbarState.getTitle() != null) {
            TextView textView3 = this.title;
            if (textView3 != null) {
                textView3.setText(toolbarState.getTitle());
            }
            TextView textView4 = this.title;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            TextAtomView textAtomView9 = this.subtitle;
            if (textAtomView9 != null) {
                textAtomView9.setText((CharSequence) null);
            }
            TextAtomView textAtomView10 = this.subtitle;
            if (textAtomView10 != null) {
                textAtomView10.setVisibility(8);
            }
        } else if (toolbarState.getAvatarSrc() == null && toolbarState.getLeftAtomText() != null) {
            TextAtomView textAtomView11 = this.avatarText;
            if (textAtomView11 != null) {
                textAtomView11.setVisibility(8);
            }
            ImageView imageView4 = this.avatarImage;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            TextAtomView textAtomView12 = this.leftText;
            if (textAtomView12 != null) {
                TextAtomHolderKt.bind$default(textAtomView12, toolbarState.getLeftAtomText(), null, 2, null);
            }
            TextAtomView textAtomView13 = this.leftText;
            if (textAtomView13 != null) {
                textAtomView13.setVisibility(0);
            }
        } else if (toolbarState.getAvatarSrc() == null && toolbarState.getLeftAtomText() == null) {
            TextAtomView textAtomView14 = this.avatarText;
            if (textAtomView14 != null) {
                textAtomView14.setVisibility(8);
            }
            ImageView imageView5 = this.avatarImage;
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            TextAtomView textAtomView15 = this.leftText;
            if (textAtomView15 != null) {
                textAtomView15.setVisibility(8);
            }
        }
        Toolbar.g gVar = new Toolbar.g(-2, -2);
        gVar.f37109a = getState().getTitleGravity();
        LinearLayout linearLayout = this.titleLayout;
        if (linearLayout != null) {
            linearLayout.setLayoutParams(gVar);
        }
    }

    @NotNull
    public final FinToolbarState getState() {
        FinToolbarState finToolbarState = this.state;
        if (finToolbarState != null) {
            return finToolbarState;
        }
        Intrinsics.n("state");
        throw null;
    }

    public final void setState(@NotNull FinToolbarState finToolbarState) {
        Intrinsics.checkNotNullParameter(finToolbarState, "<set-?>");
        this.state = finToolbarState;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinToolbarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FinToolbarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinToolbarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R.layout.new_toolbar_view, this);
        this.title = (TextView) findViewById(R.id.root_title);
        this.subtitle = (TextAtomView) findViewById(R.id.root_subtitle);
        this.titleLayout = (LinearLayout) findViewById(R.id.title_container);
        TextAtomView textAtomView = (TextAtomView) findViewById(R.id.root_right_text);
        textAtomView.setOnClickListener(new c(this, 13));
        this.rightText = textAtomView;
        TextAtomView textAtomView2 = (TextAtomView) findViewById(R.id.root_left_text);
        textAtomView2.setOnClickListener(new d(this, 14));
        this.leftText = textAtomView2;
        TextAtomView textAtomView3 = (TextAtomView) findViewById(R.id.avatar_title);
        textAtomView3.setOnClickListener(new DN.a(this, 11));
        this.avatarText = textAtomView3;
        ImageView imageView = (ImageView) findViewById(R.id.avatar_image);
        imageView.setOnClickListener(new b(this, 18));
        this.avatarImage = imageView;
        setNavigationOnClickListener(new GI.c(this, 11));
        setOnMenuItemClickListener(new N(this));
    }
}
