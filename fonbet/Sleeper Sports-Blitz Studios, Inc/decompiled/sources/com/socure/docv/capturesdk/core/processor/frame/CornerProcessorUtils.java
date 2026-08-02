package com.socure.docv.capturesdk.core.processor.frame;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ImageUtils;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import com.socure.docv.capturesdk.core.processor.interfaces.IModelProcessor;
import com.socure.docv.capturesdk.core.processor.model.LicenseProcessingData;
import com.socure.docv.capturesdk.core.processor.model.PassportExpansionData;
import com.socure.docv.capturesdk.core.processor.model.Point;
import com.socure.docv.capturesdk.core.processor.model.ProcessResult;
import com.socure.docv.capturesdk.core.processor.model.Quadrilateral;
import com.socure.docv.capturesdk.core.processor.model.SquareCroppedProcessResult;
import com.socure.docv.capturesdk.feature.scanner.data.Container;
import com.socure.docv.capturesdk.feature.scanner.data.Dimension;
import com.socure.docv.capturesdk.feature.scanner.data.GuidingBox;
import com.socure.docv.capturesdk.feature.scanner.data.ViewDimensions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: CornerProcessorUtils.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\bJ2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ,\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0004J@\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0004J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\fH\u0002J\u000e\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#J\u001e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020#J$\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u00104\u001a\u00020\bH\u0002J.\u00105\u001a\u0002062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\b2\u0006\u0010)\u001a\u00020*H\u0002J&\u00109\u001a\u00020\u000f2\u0016\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010;2\u0006\u0010<\u001a\u00020\u0004J\u0014\u0010=\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J$\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010;2\u0006\u0010?\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*J\u0018\u0010@\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\bH\u0002J*\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u000fJ\"\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010E\u001a\u00020\bJ\u001e\u0010F\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*J\"\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010I\u001a\u00020J¨\u0006K"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/frame/CornerProcessorUtils;", "", "()V", "calculateAvailableExpansionPercentage", "", "modelOutputList", "", "dimen", "Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;", "expandModelOutputCoordinates", "croppedGuidingBoxBitmapRes", "cropViewDimension", "Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "originalBitmapRes", "expansionAndProximityCheck", "", "", "bitmapDimension", "isExpansionEnabled", "expansionPercentage", "getCroppedPerspectiveCorrectedBitmap", "Landroid/graphics/Bitmap;", "iddModelOutput", "", "bitmapDimen", "paddedSquaredBitmap", "paddedScaledDownBitmap", "getExpandedPassportCoordinates", "passportExpansionData", "Lcom/socure/docv/capturesdk/core/processor/model/PassportExpansionData;", "getGuidingBoxNormalizedRect", "Landroid/graphics/RectF;", "viewDimensions", "getGuidingViewDimension", "guidingBox", "Lcom/socure/docv/capturesdk/feature/scanner/data/GuidingBox;", "getLicenseProcessedResult", "Lcom/socure/docv/capturesdk/core/processor/model/ProcessResult;", "rotationRequired", "licenseProcessingData", "Lcom/socure/docv/capturesdk/core/processor/model/LicenseProcessingData;", "modelProcessor", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IModelProcessor;", "getLongestEdge", "", "quad", "Lcom/socure/docv/capturesdk/core/processor/model/Quadrilateral;", "getMinAvailableDistance", "getMinimumPaddingPercentage", "gb", "getNormalisedModelList", "modelList", "dimension", "getSquareCroppedProcessResult", "Lcom/socure/docv/capturesdk/core/processor/model/SquareCroppedProcessResult;", "paddedBitmap", "paddedScaledDownBitmapDimens", "isRotationRequired", "iddModelOutputRaw", "Lkotlin/Pair;", "orientationConfidence", "isValidCoordinates", "processBitmap", "bitmap", "proximityCheck", "removePadding", "paddingValue", "isLeftRightPadding", "rotateHorizontalCoordinateToVertical", "bitmapResolution", "rotatedLicenseProcessResult", "rotationAngle", "translateModelOutput", "squareCropRect", "Landroid/graphics/Rect;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CornerProcessorUtils {
    public static final CornerProcessorUtils INSTANCE = new CornerProcessorUtils();

    private CornerProcessorUtils() {
    }

    private final List<Float> getNormalisedModelList(List<Float> modelList, Dimension dimension) {
        LoggerKt.logDetailed("SDLT_CDU", "getNormalisedModelList called");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(modelList);
        arrayList.set(0, Float.valueOf((float) (((Number) arrayList.get(0)).doubleValue() / dimension.getW())));
        arrayList.set(1, Float.valueOf((float) (((Number) arrayList.get(1)).doubleValue() / dimension.getH())));
        arrayList.set(3, Float.valueOf((float) (((Number) arrayList.get(3)).doubleValue() / dimension.getW())));
        arrayList.set(4, Float.valueOf((float) (((Number) arrayList.get(4)).doubleValue() / dimension.getH())));
        arrayList.set(6, Float.valueOf((float) (((Number) arrayList.get(6)).doubleValue() / dimension.getW())));
        arrayList.set(7, Float.valueOf((float) (((Number) arrayList.get(7)).doubleValue() / dimension.getH())));
        arrayList.set(9, Float.valueOf((float) (((Number) arrayList.get(9)).doubleValue() / dimension.getW())));
        arrayList.set(10, Float.valueOf((float) (((Number) arrayList.get(10)).doubleValue() / dimension.getH())));
        return arrayList;
    }

    public final List<Float> rotateHorizontalCoordinateToVertical(List<Float> modelOutputList, Dimension bitmapResolution) {
        Intrinsics.checkNotNullParameter(modelOutputList, "modelOutputList");
        Intrinsics.checkNotNullParameter(bitmapResolution, "bitmapResolution");
        LoggerKt.logDetailed("SDLT_CDU", "rotateVerticalCoordinatesToHorizontal called");
        ArrayList arrayList = new ArrayList();
        arrayList.add(modelOutputList.get(4));
        arrayList.add(Float.valueOf(((float) bitmapResolution.getW()) - modelOutputList.get(3).floatValue()));
        arrayList.add(modelOutputList.get(5));
        arrayList.add(modelOutputList.get(7));
        arrayList.add(Float.valueOf(((float) bitmapResolution.getW()) - modelOutputList.get(6).floatValue()));
        arrayList.add(modelOutputList.get(8));
        arrayList.add(modelOutputList.get(10));
        arrayList.add(Float.valueOf(((float) bitmapResolution.getW()) - modelOutputList.get(9).floatValue()));
        arrayList.add(modelOutputList.get(11));
        arrayList.add(modelOutputList.get(1));
        arrayList.add(Float.valueOf(((float) bitmapResolution.getW()) - modelOutputList.get(0).floatValue()));
        arrayList.add(modelOutputList.get(2));
        return arrayList;
    }

    public final List<Float> translateModelOutput(List<Float> modelOutputList, Rect squareCropRect) {
        Intrinsics.checkNotNullParameter(modelOutputList, "modelOutputList");
        Intrinsics.checkNotNullParameter(squareCropRect, "squareCropRect");
        LoggerKt.logDetailed("SDLT_CDU", "translateModelOutput called");
        List<Float> mutableList = CollectionsKt.toMutableList((Collection) modelOutputList);
        float f = squareCropRect.left;
        float f2 = squareCropRect.top;
        Iterator it = CollectionsKt.arrayListOf(0, 3, 6, 9).iterator();
        while (it.hasNext()) {
            Integer index = (Integer) it.next();
            Intrinsics.checkNotNullExpressionValue(index, "index");
            mutableList.set(index.intValue(), Float.valueOf(mutableList.get(index.intValue()).floatValue() + f));
        }
        Iterator it2 = CollectionsKt.arrayListOf(1, 4, 7, 10).iterator();
        while (it2.hasNext()) {
            Integer index2 = (Integer) it2.next();
            Intrinsics.checkNotNullExpressionValue(index2, "index");
            mutableList.set(index2.intValue(), Float.valueOf(mutableList.get(index2.intValue()).floatValue() + f2));
        }
        return mutableList;
    }

    public final List<Float> removePadding(List<Float> modelOutputList, float paddingValue, boolean isLeftRightPadding) {
        Intrinsics.checkNotNullParameter(modelOutputList, "modelOutputList");
        LoggerKt.logDetailed("SDLT_CDU", "getModelOutputWithReducedPadding called");
        List<Float> mutableList = CollectionsKt.toMutableList((Collection) modelOutputList);
        if (isLeftRightPadding) {
            Iterator it = CollectionsKt.arrayListOf(0, 3, 6, 9).iterator();
            while (it.hasNext()) {
                Integer index = (Integer) it.next();
                Intrinsics.checkNotNullExpressionValue(index, "index");
                mutableList.set(index.intValue(), Float.valueOf(mutableList.get(index.intValue()).floatValue() - paddingValue));
            }
        } else {
            Iterator it2 = CollectionsKt.arrayListOf(1, 4, 7, 10).iterator();
            while (it2.hasNext()) {
                Integer index2 = (Integer) it2.next();
                Intrinsics.checkNotNullExpressionValue(index2, "index");
                mutableList.set(index2.intValue(), Float.valueOf(mutableList.get(index2.intValue()).floatValue() - paddingValue));
            }
        }
        return mutableList;
    }

    private final RectF getGuidingBoxNormalizedRect(ViewDimensions viewDimensions) {
        float leftTopX = viewDimensions.getGuidingBox().getLeftTopX() / viewDimensions.getContainer().getWidth();
        float leftTopY = viewDimensions.getGuidingBox().getLeftTopY() / viewDimensions.getContainer().getHeight();
        return new RectF(leftTopX, leftTopY, (viewDimensions.getGuidingBox().getWidth() / viewDimensions.getContainer().getWidth()) + leftTopX, (viewDimensions.getGuidingBox().getHeight() / viewDimensions.getContainer().getHeight()) + leftTopY);
    }

    public final List<Float> expandModelOutputCoordinates(List<Float> modelOutputList, Dimension croppedGuidingBoxBitmapRes, ViewDimensions cropViewDimension, Dimension originalBitmapRes) {
        Intrinsics.checkNotNullParameter(modelOutputList, "modelOutputList");
        Intrinsics.checkNotNullParameter(croppedGuidingBoxBitmapRes, "croppedGuidingBoxBitmapRes");
        Intrinsics.checkNotNullParameter(cropViewDimension, "cropViewDimension");
        Intrinsics.checkNotNullParameter(originalBitmapRes, "originalBitmapRes");
        LoggerKt.logDetailed("SDLT_CDU", "expandModelOutputCoordinates called");
        List<Float> mutableList = CollectionsKt.toMutableList((Collection) modelOutputList);
        RectF guidingBoxNormalizedRect = getGuidingBoxNormalizedRect(cropViewDimension);
        List<Float> normalisedModelList = getNormalisedModelList(mutableList, croppedGuidingBoxBitmapRes);
        Iterator it = CollectionsKt.arrayListOf(0, 3, 6, 9).iterator();
        while (it.hasNext()) {
            Integer index = (Integer) it.next();
            Intrinsics.checkNotNullExpressionValue(index, "index");
            normalisedModelList.set(index.intValue(), Float.valueOf(guidingBoxNormalizedRect.left + (normalisedModelList.get(index.intValue()).floatValue() * guidingBoxNormalizedRect.width())));
            mutableList.set(index.intValue(), Float.valueOf(normalisedModelList.get(index.intValue()).floatValue() * ((float) originalBitmapRes.getW())));
        }
        Iterator it2 = CollectionsKt.arrayListOf(1, 4, 7, 10).iterator();
        while (it2.hasNext()) {
            Integer index2 = (Integer) it2.next();
            Intrinsics.checkNotNullExpressionValue(index2, "index");
            normalisedModelList.set(index2.intValue(), Float.valueOf(guidingBoxNormalizedRect.top + (normalisedModelList.get(index2.intValue()).floatValue() * guidingBoxNormalizedRect.height())));
            mutableList.set(index2.intValue(), Float.valueOf(normalisedModelList.get(index2.intValue()).floatValue() * ((float) originalBitmapRes.getH())));
        }
        return mutableList;
    }

    private final boolean proximityCheck(Quadrilateral quad, Dimension dimen) {
        LoggerKt.logDetailed("SDLT_CDU", "proximityCheck called");
        Point[] pointArr = {quad.getTopLeft(), quad.getTopRight(), quad.getBottomRight(), quad.getBottomLeft()};
        for (int i = 0; i < 4; i++) {
            Point point = pointArr[i];
            if (point.getX() < 0.0f || point.getX() > dimen.getW() || point.getY() < 0.0f || point.getY() > dimen.getH()) {
                LoggerKt.logDetailed("SDLT_CDU", "proximityCheck failed for quad: " + quad + " with dimen : " + dimen);
                return false;
            }
        }
        LoggerKt.logDetailed("SDLT_CDU", "proximityCheck pass for quad: " + quad + " with dimen : " + dimen);
        return true;
    }

    public final boolean expansionAndProximityCheck(List<Float> modelOutputList, Dimension bitmapDimension, boolean isExpansionEnabled, float expansionPercentage) {
        Quadrilateral quadrilateral$capturesdk_productionRelease;
        Intrinsics.checkNotNullParameter(modelOutputList, "modelOutputList");
        Intrinsics.checkNotNullParameter(bitmapDimension, "bitmapDimension");
        if (isExpansionEnabled) {
            Quadrilateral quadrilateral$capturesdk_productionRelease2 = ImageUtils.INSTANCE.getQuadrilateral$capturesdk_productionRelease(modelOutputList);
            quadrilateral$capturesdk_productionRelease = ImageUtils.INSTANCE.expandQuadrilateral$capturesdk_productionRelease(quadrilateral$capturesdk_productionRelease2, ImageUtils.INSTANCE.getExpansionOffset$capturesdk_productionRelease(quadrilateral$capturesdk_productionRelease2, expansionPercentage));
        } else {
            quadrilateral$capturesdk_productionRelease = ImageUtils.INSTANCE.getQuadrilateral$capturesdk_productionRelease(modelOutputList);
        }
        return proximityCheck(quadrilateral$capturesdk_productionRelease, bitmapDimension);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap getCroppedPerspectiveCorrectedBitmap(float[] iddModelOutput, List<Float> modelOutputList, Dimension bitmapDimen, Bitmap paddedSquaredBitmap, Bitmap paddedScaledDownBitmap, float expansionPercentage) {
        Intrinsics.checkNotNullParameter(modelOutputList, "modelOutputList");
        Intrinsics.checkNotNullParameter(bitmapDimen, "bitmapDimen");
        Intrinsics.checkNotNullParameter(paddedSquaredBitmap, "paddedSquaredBitmap");
        Intrinsics.checkNotNullParameter(paddedScaledDownBitmap, "paddedScaledDownBitmap");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        long currentTimeMillis = System.currentTimeMillis();
        T t = 0;
        t = 0;
        t = 0;
        if (iddModelOutput != null && Utils.INSTANCE.cornersFound$capturesdk_productionRelease(iddModelOutput) && INSTANCE.expansionAndProximityCheck(modelOutputList, bitmapDimen, ImageUtils.INSTANCE.isCornerExpansionEnabled(), expansionPercentage)) {
            t = ImageUtils.INSTANCE.postCornerProcessing$capturesdk_productionRelease(paddedScaledDownBitmap, paddedSquaredBitmap, iddModelOutput, ImageUtils.getCropDocAspectRatio$default(ImageUtils.INSTANCE, ArraysKt.toList(iddModelOutput), false, 2, null));
        }
        objectRef.element = t;
        LoggerKt.logDetailed("SDLT_CDU", "time taken for cropping: " + (System.currentTimeMillis() - currentTimeMillis));
        return (Bitmap) objectRef.element;
    }

    public final float calculateAvailableExpansionPercentage(List<Float> modelOutputList, Dimension dimen) {
        Intrinsics.checkNotNullParameter(modelOutputList, "modelOutputList");
        Intrinsics.checkNotNullParameter(dimen, "dimen");
        Quadrilateral quadrilateral$capturesdk_productionRelease = ImageUtils.INSTANCE.getQuadrilateral$capturesdk_productionRelease(modelOutputList);
        float minAvailableDistance = getMinAvailableDistance(quadrilateral$capturesdk_productionRelease, dimen);
        double longestEdge = getLongestEdge(quadrilateral$capturesdk_productionRelease);
        if (minAvailableDistance > 0.0f && longestEdge > 0.0d) {
            float f = ((float) ((minAvailableDistance / longestEdge) * 100)) - 0.2f;
            LoggerKt.logDetailed("SDLT_CDU", "availablePercentageForPadding: " + f + ", dimen: " + dimen);
            return f;
        }
        LoggerKt.logDetailed("SDLT_CDU", "availablePercentageForPadding: 0, dimen: " + dimen);
        return 0.0f;
    }

    private final double getLongestEdge(Quadrilateral quad) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(ImageUtils.INSTANCE.calculateEdgeLength$capturesdk_productionRelease(quad.getTopLeft(), quad.getTopRight())));
        arrayList.add(Double.valueOf(ImageUtils.INSTANCE.calculateEdgeLength$capturesdk_productionRelease(quad.getTopRight(), quad.getBottomRight())));
        arrayList.add(Double.valueOf(ImageUtils.INSTANCE.calculateEdgeLength$capturesdk_productionRelease(quad.getBottomRight(), quad.getBottomLeft())));
        arrayList.add(Double.valueOf(ImageUtils.INSTANCE.calculateEdgeLength$capturesdk_productionRelease(quad.getBottomLeft(), quad.getTopLeft())));
        Double maxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Double>) arrayList);
        if (maxOrNull != null) {
            return maxOrNull.doubleValue();
        }
        return 0.0d;
    }

    private final float getMinAvailableDistance(Quadrilateral quad, Dimension dimen) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(quad.getTopLeft().getX()));
        arrayList.add(Float.valueOf(quad.getTopLeft().getY()));
        arrayList.add(Float.valueOf((float) (dimen.getW() - quad.getTopRight().getX())));
        arrayList.add(Float.valueOf(quad.getTopRight().getY()));
        arrayList.add(Float.valueOf((float) (dimen.getW() - quad.getBottomRight().getX())));
        arrayList.add(Float.valueOf((float) (dimen.getH() - quad.getBottomRight().getY())));
        arrayList.add(Float.valueOf(quad.getBottomLeft().getX()));
        arrayList.add(Float.valueOf((float) (dimen.getH() - quad.getBottomLeft().getY())));
        Float minOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) arrayList);
        if (minOrNull != null) {
            return minOrNull.floatValue();
        }
        return 0.0f;
    }

    public final float getMinimumPaddingPercentage(GuidingBox gb) {
        Intrinsics.checkNotNullParameter(gb, "gb");
        float w = (float) ((((gb.getParentDimension().getW() - gb.getWidth()) / 2) / gb.getWidth()) * 100);
        LoggerKt.logDetailed("SDLT_CDU", "minimumPercentageForPadding " + w + ", gb: " + gb);
        return w;
    }

    public final boolean isRotationRequired(Pair<float[], float[]> iddModelOutputRaw, float orientationConfidence) {
        LoggerKt.logDetailed("SDLT_CDU", "isRotationRequired called");
        return iddModelOutputRaw != null && iddModelOutputRaw.getFirst()[0] < orientationConfidence;
    }

    public final ViewDimensions getGuidingViewDimension(GuidingBox guidingBox) {
        Intrinsics.checkNotNullParameter(guidingBox, "guidingBox");
        LoggerKt.logDetailed("SDLT_CDU", "getGuidingViewDimension called");
        return new ViewDimensions(new Container((int) guidingBox.getParentDimension().getW(), (int) guidingBox.getParentDimension().getH()), UtilsKt.getScaledGuidingBoxArea(guidingBox, 0.04f), false, 4, null);
    }

    public final List<Float> getExpandedPassportCoordinates(List<Float> modelOutputList, PassportExpansionData passportExpansionData) {
        Intrinsics.checkNotNullParameter(modelOutputList, "modelOutputList");
        Intrinsics.checkNotNullParameter(passportExpansionData, "passportExpansionData");
        LoggerKt.logDetailed("SDLT_CDU", "getPassportCoordinates called");
        List<Float> mutableList = CollectionsKt.toMutableList((Collection) modelOutputList);
        ImageUtils.INSTANCE.scaleIddModelCoordinates$capturesdk_productionRelease(mutableList, passportExpansionData.getPaddedSquaredBitmapRes(), passportExpansionData.getPaddedScaledDownBitmapRes());
        return expandModelOutputCoordinates(removePadding(mutableList, ((float) (passportExpansionData.getPaddedSquaredBitmapRes().getH() - passportExpansionData.getProcessedBitmapRes().getH())) / 2, false), passportExpansionData.getProcessedBitmapRes(), passportExpansionData.getCropViewDimension(), passportExpansionData.getOriginalBitmapRes());
    }

    public final ProcessResult getLicenseProcessedResult(boolean rotationRequired, LicenseProcessingData licenseProcessingData, IModelProcessor modelProcessor) {
        Rect rect;
        Intrinsics.checkNotNullParameter(licenseProcessingData, "licenseProcessingData");
        Intrinsics.checkNotNullParameter(modelProcessor, "modelProcessor");
        LoggerKt.logDetailed("SDLT_CDU", "getLicenseProcessedResult called");
        Bitmap paddedSquaredBitmap = licenseProcessingData.getPaddedSquaredBitmap();
        Bitmap paddedScaledDownBitmap = licenseProcessingData.getPaddedScaledDownBitmap();
        Pair<float[], float[]> component3 = licenseProcessingData.component3();
        List<Float> component4 = licenseProcessingData.component4();
        Dimension dimens$capturesdk_productionRelease = ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease(paddedSquaredBitmap);
        if (isValidCoordinates(component4)) {
            SquareCroppedProcessResult squareCroppedProcessResult = getSquareCroppedProcessResult(component4, paddedSquaredBitmap, ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease(paddedScaledDownBitmap), modelProcessor);
            Rect squareCropRect = squareCroppedProcessResult.getSquareCropRect();
            ProcessResult processResult = squareCroppedProcessResult.getProcessResult();
            Bitmap outputBitmap = processResult.getOutputBitmap();
            Bitmap modelProcessedBitmap = processResult.getModelProcessedBitmap();
            Pair<float[], float[]> modelProcessedRawData = processResult.getModelProcessedRawData();
            component4 = processResult.getModelList();
            rect = squareCropRect;
            paddedSquaredBitmap = outputBitmap;
            paddedScaledDownBitmap = modelProcessedBitmap;
            component3 = modelProcessedRawData;
        } else {
            rect = null;
        }
        if (isValidCoordinates(component4)) {
            ImageUtils.INSTANCE.scaleIddModelCoordinates$capturesdk_productionRelease(component4, ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease(paddedSquaredBitmap), ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease(paddedScaledDownBitmap));
            if (rect != null) {
                component4 = translateModelOutput(component4, rect);
            }
            if (rotationRequired) {
                component4 = rotateHorizontalCoordinateToVertical(component4, dimens$capturesdk_productionRelease);
            }
            component4 = removePadding(component4, (licenseProcessingData.getOriginalBitmap().getHeight() - licenseProcessingData.getOriginalBitmap().getWidth()) / 2, true);
        }
        return new ProcessResult(paddedSquaredBitmap, component4, paddedScaledDownBitmap, component3);
    }

    public final Pair<float[], float[]> processBitmap(Bitmap bitmap, IModelProcessor modelProcessor) {
        Pair<float[], float[]> separateHorizontalConfArray$capturesdk_productionRelease;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(modelProcessor, "modelProcessor");
        LoggerKt.logDetailed("SDLT_CDU", "processBitmap called");
        long currentTimeMillis = System.currentTimeMillis();
        float[] process = modelProcessor.process(bitmap);
        Pair<float[], float[]> pair = null;
        if (process != null && (separateHorizontalConfArray$capturesdk_productionRelease = Utils.INSTANCE.separateHorizontalConfArray$capturesdk_productionRelease(process)) != null) {
            pair = new Pair<>(separateHorizontalConfArray$capturesdk_productionRelease.getFirst(), separateHorizontalConfArray$capturesdk_productionRelease.getSecond());
        }
        LoggerKt.logDetailed("SDLT_CDU", "timeTaken: " + (System.currentTimeMillis() - currentTimeMillis));
        return pair;
    }

    private final SquareCroppedProcessResult getSquareCroppedProcessResult(List<Float> modelOutputList, Bitmap paddedBitmap, Dimension paddedScaledDownBitmapDimens, IModelProcessor modelProcessor) {
        ArrayList arrayList;
        float[] second;
        LoggerKt.logDetailed("SDLT_CDU", "getSquareCroppedProcessResult called");
        Rect calculateRectForSquareCrop = ImageUtils.INSTANCE.calculateRectForSquareCrop(ImageUtils.INSTANCE.scaleIddModelCoordinates$capturesdk_productionRelease(modelOutputList, ImageUtils.INSTANCE.getDimens$capturesdk_productionRelease(paddedBitmap), paddedScaledDownBitmapDimens));
        Bitmap createBitmap = Bitmap.createBitmap(paddedBitmap, calculateRectForSquareCrop.left, calculateRectForSquareCrop.top, calculateRectForSquareCrop.width(), calculateRectForSquareCrop.height());
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(paddedBitma… squareCropRect.height())");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 256, 256, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(padde…rnerConstants.H_CD, true)");
        Pair<float[], float[]> processBitmap = processBitmap(createScaledBitmap, modelProcessor);
        if (processBitmap == null || (second = processBitmap.getSecond()) == null || (arrayList = ArraysKt.toMutableList(second)) == null) {
            arrayList = new ArrayList();
        }
        return new SquareCroppedProcessResult(calculateRectForSquareCrop, new ProcessResult(createBitmap, arrayList, createScaledBitmap, processBitmap));
    }

    public final ProcessResult rotatedLicenseProcessResult(Bitmap paddedSquaredBitmap, float rotationAngle, IModelProcessor modelProcessor) {
        float[] second;
        Collection mutableList;
        Intrinsics.checkNotNullParameter(paddedSquaredBitmap, "paddedSquaredBitmap");
        Intrinsics.checkNotNullParameter(modelProcessor, "modelProcessor");
        LoggerKt.logDetailed("SDLT_CDU", "rotatedLicenseProcess called");
        Collection arrayList = new ArrayList();
        Bitmap rotateImage$capturesdk_productionRelease = ImageUtils.INSTANCE.rotateImage$capturesdk_productionRelease(paddedSquaredBitmap, rotationAngle);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(rotateImage$capturesdk_productionRelease, 256, 256, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(rotat…rnerConstants.H_CD, true)");
        Pair<float[], float[]> processBitmap = processBitmap(createScaledBitmap, modelProcessor);
        if (processBitmap != null && (second = processBitmap.getSecond()) != null && (mutableList = ArraysKt.toMutableList(second)) != null) {
            arrayList = mutableList;
        }
        return new ProcessResult(rotateImage$capturesdk_productionRelease, (List) arrayList, createScaledBitmap, processBitmap);
    }

    public final boolean isValidCoordinates(List<Float> modelOutputList) {
        Intrinsics.checkNotNullParameter(modelOutputList, "modelOutputList");
        LoggerKt.logDetailed("SDLT_CDU", "isValidCoordinates called");
        List<Float> list = modelOutputList;
        return !list.isEmpty() && Utils.INSTANCE.cornersFound$capturesdk_productionRelease(CollectionsKt.toFloatArray(list));
    }
}
